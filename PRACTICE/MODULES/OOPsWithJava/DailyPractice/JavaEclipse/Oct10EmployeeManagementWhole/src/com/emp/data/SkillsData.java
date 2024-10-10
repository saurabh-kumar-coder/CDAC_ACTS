package com.emp.data;

import java.util.ArrayList;
import java.util.List;

import com.emp.pojos.Skills;

public class SkillsData {
	public static List<Skills> getSkillsData() {
		List<Skills> skillsData = new ArrayList<>();
        skillsData.add(new Skills("Java"));
        skillsData.add(new Skills("SQL"));
        skillsData.add(new Skills("Communication"));
        skillsData.add(new Skills("MySQL"));
        return skillsData;
	}
}
