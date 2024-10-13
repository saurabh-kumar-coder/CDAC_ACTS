package com.strategydesign.StrategyDesignPattern.encrypt;

import com.strategydesign.StrategyDesignPattern.enums.EncodingPatterns;

public interface Encryption {
	// string to be encrypted
	public void encrypt(String toBeEncrypted);
	
	// get the type of encryption
	public EncodingPatterns getEncryptionMethod();
}
