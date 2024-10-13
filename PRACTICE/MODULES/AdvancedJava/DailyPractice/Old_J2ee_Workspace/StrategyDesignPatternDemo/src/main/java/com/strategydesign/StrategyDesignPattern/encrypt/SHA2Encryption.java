package com.strategydesign.StrategyDesignPattern.encrypt;

import org.springframework.stereotype.Service;

import com.strategydesign.StrategyDesignPattern.enums.EncodingPatterns;

@Service
public class SHA2Encryption implements Encryption {
	@Override
	public void encrypt(String toBeEncrypted) {
		System.out.println("I am encrypting using SHA2 encryption method");
	}

	@Override
	public EncodingPatterns getEncryptionMethod() {
		return EncodingPatterns.SHA2;
	}
}
