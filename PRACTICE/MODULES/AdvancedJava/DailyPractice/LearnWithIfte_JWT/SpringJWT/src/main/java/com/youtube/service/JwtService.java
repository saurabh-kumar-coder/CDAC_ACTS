package com.youtube.service;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Service;

import com.youtube.model.User;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

	private final String SECRET_KEY = "36cb24aafae32bd8b73cd182ad432c07185529cd6959173909887d5dd6319e7d";

//	to generate a token
	public String generateToken(User user) {
		String token = Jwts
				.builder()
				.subject(user.getUsername())
				.issuedAt(new Date(System.currentTimeMillis()))
				.expiration(new Date(System.currentTimeMillis() + 24*60*60*1000))
				.signWith(getSigninKey())
				.compact();
		return token;
	}

	private SecretKey getSigninKey() {
		// TODO Auto-generated method stub
		byte[] keyBytes = Decoders.BASE64URL.decode(SECRET_KEY);
		return Keys.hmacShaKeyFor(keyBytes);
	}
}
