package com.emp.pojos;

import java.io.Serializable;

public class Skills implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5920679305542104943L;
	String skills;

	public Skills(String skills) {
		super();
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Skills [skills=" + skills + "]";
	}
}