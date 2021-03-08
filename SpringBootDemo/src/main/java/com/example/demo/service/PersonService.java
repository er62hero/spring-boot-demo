package com.example.demo.service;

import java.net.InetAddress;

import org.springframework.stereotype.Service;

import com.example.demo.model.Person;

@Service
public class PersonService {

	public Person getPerson() {
		return new Person().builder().name("person-01").age(16).gender("man").hostName(this.getHostName()).build();
	}

	public Person getPerson2() {
		return new Person().builder().name("person-02").age(16).gender("woman").hostName(this.getHostName()).build();
	}

	private String getHostName() {
		try {
			return InetAddress.getLocalHost().getHostName();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "UnknownHost";
	}

}
