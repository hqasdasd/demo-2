package com.example.demo.service;

import com.example.demo.domain.PojoPerson;

public interface TestService{

	PojoPerson select(String name, Integer age);

}
