package com.strategydesign.StrategyDesignPattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.strategydesign.StrategyDesignPattern.enums.EncodingPatterns;
import com.strategydesign.StrategyDesignPattern.factory.EncryptionFactory;

@RestController
public class DemoController {

	@Autowired
	EncryptionFactory factory;
	
	@GetMapping("/encrypt")
	public void encryptWithEncoder(@RequestParam EncodingPatterns encodingPatterns) {
		factory.findEncryptionType(encodingPatterns).encrypt("string to encrypt");
	}
	
}
