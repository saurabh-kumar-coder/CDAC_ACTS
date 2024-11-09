package com.cdac.acts.userservice.service;

import java.util.List;

import com.cdac.acts.userservice.dto.UserLocationDTO;
import com.cdac.acts.userservice.entity.User;

public interface MappingService {
	List<UserLocationDTO> getAllUsersLocation();
	UserLocationDTO convertDataIntoDTO (User userData);
}
