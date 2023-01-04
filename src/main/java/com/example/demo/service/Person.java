package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.PersonRepository;

@Service
@Transactional
public class Person {
	
	@Autowired
	PersonRepository PersonRepository;
	
	//レコードを全件取得する
	public List<com.example.model.Person> findAllpersonData(){
		return PersonRepository.findAll();
	}
	
}
