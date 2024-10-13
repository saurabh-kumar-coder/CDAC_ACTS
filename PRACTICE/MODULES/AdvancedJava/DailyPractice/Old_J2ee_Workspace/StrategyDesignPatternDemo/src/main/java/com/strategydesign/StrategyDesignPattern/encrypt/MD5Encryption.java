package com.strategydesign.StrategyDesignPattern.encrypt;

import org.springframework.stereotype.Service;

import com.strategydesign.StrategyDesignPattern.enums.EncodingPatterns;

@Service
public class MD5Encryption implements Encryption {
	@Override
	public void encrypt(String toBeEncrypted) {
		System.out.println("I am encrypting using MD5 encryption method");
	}

	@Override
	public EncodingPatterns getEncryptionMethod() {
		return EncodingPatterns.MD5;
	}
}
