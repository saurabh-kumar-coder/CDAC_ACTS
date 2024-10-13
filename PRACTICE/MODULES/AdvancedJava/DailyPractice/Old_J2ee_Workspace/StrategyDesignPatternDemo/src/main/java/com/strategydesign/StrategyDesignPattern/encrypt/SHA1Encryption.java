package com.strategydesign.StrategyDesignPattern.encrypt;

import org.springframework.stereotype.Service;

import com.strategydesign.StrategyDesignPattern.enums.EncodingPatterns;

@Service
public class SHA1Encryption implements Encryption {
	@Override
	public void encrypt(String toBeEncrypted) {
		System.out.println("I am encrypting using SHA1 encryption method");
	}

	@Override
	public EncodingPatterns getEncryptionMethod() {
		return EncodingPatterns.SHA1;
	}
}
