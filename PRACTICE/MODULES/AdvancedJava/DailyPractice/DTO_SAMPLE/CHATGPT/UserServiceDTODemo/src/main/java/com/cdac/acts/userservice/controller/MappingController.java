package com.cdac.acts.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.acts.userservice.dto.UserLocationDTO;
import com.cdac.acts.userservice.service.MappingService;
@RestController
@RequestMapping("/dto")
public class MappingController {
	// create instance of the mapService class   
    @Autowired  
    private MappingService mapService;  
    // create endpoint  
    @GetMapping("/map")  
    // when user hit the endpoint, it returns the response body  
    @ResponseBody  
    public List<UserLocationDTO> getAllUsersLocation() {  
        // call getAllUsersLocation() method from the service which we created before  
        // store the result in a list of UserLocationDTO  
        List <UserLocationDTO> usersLocation = mapService.getAllUsersLocation();  
        // return usersLocation  
        return usersLocation;  
    }  
}
