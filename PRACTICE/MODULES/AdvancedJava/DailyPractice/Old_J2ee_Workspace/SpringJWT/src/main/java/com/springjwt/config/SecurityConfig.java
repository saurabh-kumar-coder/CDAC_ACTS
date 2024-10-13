package com.springjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer.AuthorizationManagerRequestMatcherRegistry;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer.AuthorizedUrl;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.springjwt.filter.JwtAuthenticationFilter;
import com.springjwt.service.UserDetailsServiceImple;

import io.jsonwebtoken.security.Request;
import jakarta.security.auth.message.config.AuthConfig;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	private final UserDetailsServiceImple userDetailsServiceImple;
	private final JwtAuthenticationFilter jwtAuthenticationFilter;
	private final CustomLogoutHandler logoutHandler;

	public SecurityConfig(UserDetailsServiceImple userDetailsServiceImple,
			JwtAuthenticationFilter jwtAuthenticationFilter, CustomLogoutHandler logoutHandler) {
		super();
		this.userDetailsServiceImple = userDetailsServiceImple;
		this.jwtAuthenticationFilter = jwtAuthenticationFilter;
		this.logoutHandler = logoutHandler;
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		return http
				.csrf(AbstractHttpConfigurer::disable)
				.authorizeHttpRequests(
						req -> req.requestMatchers("/login/**", "/register/**") //AuthorizedUrl
							.permitAll() //AuthorizationManagerRequestMatcherRegistry
							.requestMatchers("/admin_only/**").hasAuthority("ADMIN")
							.anyRequest() //AuthorizedUrl
							.authenticated()
						).userDetailsService(userDetailsServiceImple)
				.sessionManagement(session -> session
						.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
				.exceptionHandling(
						e -> e.accessDeniedHandler(
								(request, response, accessDeniedException) -> response.setStatus(403)
								)
								.authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
						)
				.logout(l -> l
							.logoutUrl("/logout")
							.addLogoutHandler(logoutHandler)
							.logoutSuccessHandler((request, response, authentication) -> SecurityContextHolder.clearContext())
						)
				.build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
		return configuration.getAuthenticationManager();
	}
}
