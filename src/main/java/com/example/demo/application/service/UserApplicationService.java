package com.example.demo.application.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class UserApplicationService {
	
	@Autowired
	private MessageSource messageSource;
	
	
	public Map<String, Integer> getGenderMap() {
		Map<String, Integer> genderMap = new LinkedHashMap<>();
		genderMap.put("男性", 1);
		genderMap.put("女性", 1);
		return genderMap;
	}
}