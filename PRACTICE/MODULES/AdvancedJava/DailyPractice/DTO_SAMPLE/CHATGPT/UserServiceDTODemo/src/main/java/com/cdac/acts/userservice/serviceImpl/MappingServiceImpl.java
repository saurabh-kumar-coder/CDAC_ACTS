package com.cdac.acts.userservice.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.acts.userservice.dto.UserLocationDTO;
import com.cdac.acts.userservice.entity.Location;
import com.cdac.acts.userservice.entity.User;
import com.cdac.acts.userservice.repository.UserRepository;
import com.cdac.acts.userservice.service.MappingService;

@Service
public class MappingServiceImpl implements MappingService {

	@Autowired
	// create instance of our UserRepository
	private UserRepository userRepository;

	// create getAllUsersLocation() method that returns a list of UserLocationDTO
	public List<UserLocationDTO> getAllUsersLocation() {
		return ((List<User>) userRepository.findAll()).stream().map(this::convertDataIntoDTO)
				.collect(Collectors.toList());
	}

	// create convertDataIntoDTO() method that returns UserLocationDTO
	public UserLocationDTO convertDataIntoDTO(User userData) {

		// create instance of our UserLocationDTO class
		UserLocationDTO dto = new UserLocationDTO();

		// set username and userId in dto from the userData
		dto.setUserId(userData.getId());
		dto.setUsername(userData.getUsername());

		// create instance of the Location class
		Location loc = userData.getLocation();
		if (loc != null) {
			// set latitude, longitude, and place in dto from location
			dto.setLatitude(loc.getLatitude());
			dto.setLongitude(loc.getLongitude());
			dto.setPlace(loc.getPlaceName());
		}
		return dto;
	}
}
