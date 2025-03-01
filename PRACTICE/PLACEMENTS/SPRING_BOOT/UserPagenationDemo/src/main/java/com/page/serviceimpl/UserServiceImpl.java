package com.page.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.page.dto.UserDTO;
import com.page.entity.User;
import com.page.exceptions.UserNotFoundException;
import com.page.repository.UserRepository;
import com.page.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<UserDTO> getPagenatedData(int current, int size, String sort) {
		Pageable pageable;
		if(sort.equals(null)) {
			pageable = PageRequest.of(current, size, Sort.unsorted());
			
		} else {
			pageable = PageRequest.of(current, size, Sort.by(sort));			
		}
		Page<User> page = userRepository.findAll(pageable);
		return page.stream()
				.map(user -> new UserDTO(user.getUserId(), user.getUsername(), user.getCity())).toList();
	}

	@Override
	public UserDTO findUserById(Long userId) {
		// TODO Auto-generated method stub
		Optional<User> userById = userRepository.findById(userId);
		if(userById.isEmpty()) {
			throw new UserNotFoundException("User With Id " + userId + " Not Found");
		}
		User user = userById.get();
		UserDTO dto = new UserDTO();
		BeanUtils.copyProperties(user, dto);
		return dto;
	}
	
}
