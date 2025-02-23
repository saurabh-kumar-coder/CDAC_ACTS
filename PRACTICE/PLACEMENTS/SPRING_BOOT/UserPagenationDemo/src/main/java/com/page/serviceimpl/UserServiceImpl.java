package com.page.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.page.dto.UserDTO;
import com.page.repository.UserRepository;
import com.page.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<UserDTO> getPagenatedData() {
		// TODO Auto-generated method stub
		
		return null;
	}

}
