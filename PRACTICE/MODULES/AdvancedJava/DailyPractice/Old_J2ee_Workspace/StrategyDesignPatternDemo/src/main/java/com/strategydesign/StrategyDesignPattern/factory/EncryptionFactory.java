package com.strategydesign.StrategyDesignPattern.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.strategydesign.StrategyDesignPattern.encrypt.Encryption;
import com.strategydesign.StrategyDesignPattern.enums.EncodingPatterns;

@Component
public class EncryptionFactory {
	Map<EncodingPatterns, Encryption> map;
	
	@Autowired
	public EncryptionFactory(Set<Encryption> encryptionTypeSet) {
		createStrategy(encryptionTypeSet);
	}

	private void createStrategy(Set<Encryption> encryptionTypeSet) {
		map = new HashMap<EncodingPatterns, Encryption>();
		encryptionTypeSet.stream().forEach(encryptionType -> map.put(encryptionType.getEncryptionMethod() ,encryptionType));
	}
	
	public Encryption findEncryptionType(EncodingPatterns encodingPatterns) {
		return map.get(encodingPatterns);
	}

}
