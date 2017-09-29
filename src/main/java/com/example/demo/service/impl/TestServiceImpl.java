package com.example.demo.service.impl;

import com.example.demo.domain.PojoPerson;
import com.example.demo.service.TestService;

public class TestServiceImpl implements TestService {

	@Override
	public PojoPerson select(String name, Integer age) {
		PojoPerson person=new PojoPerson();
		person.setAge(age);
		person.setName(name);
		return person;
	}

}
