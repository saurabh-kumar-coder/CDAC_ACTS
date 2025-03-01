package com.page.service;

import java.util.List;

import com.page.dto.UserDTO;

public interface UserService {
	List<UserDTO> getPagenatedData(int current, int size, String sort);

	UserDTO findUserById(Long userId);
}
