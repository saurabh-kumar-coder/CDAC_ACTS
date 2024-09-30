package com.service;

@FunctionalInterface
public interface PayableBonus {
	default double giveBonus() {
		return 0.0;
	}
	double tip();
}
