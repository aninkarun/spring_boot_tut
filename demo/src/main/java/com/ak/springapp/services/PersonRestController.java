package com.ak.springapp.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ak.entity.Person;

@RestController
public class PersonRestController {
	@RequestMapping(value = "/persistPerson", method = RequestMethod.POST)
	public ResponseEntity<Object> persistPerson(@RequestBody Person person) {
		
		
		
		System.out.println(person.getName());
		Map<String, String> headers = new HashMap<String,String>();
		headers.put("reply", "successfully posted details regarding "+person.getName());
		
		// write code to store person details in DB
		
		return new ResponseEntity<Object>(headers , HttpStatus.OK);
	}
}
