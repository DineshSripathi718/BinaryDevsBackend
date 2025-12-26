package com.binarydevs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.binarydevs.Entities.Contacts;
import com.binarydevs.services.BinaryDevsService;

@RestController
@RequestMapping("/api/user")
public class BinaryDevsController {
	
	@Autowired
	private BinaryDevsService service;
	
	@PostMapping("/contact-us")
	public ResponseEntity<Contacts> contactUs(@RequestBody Contacts dto) {
	    Contacts contact = new Contacts();
	    contact.setFullName(dto.getFullName());
	    contact.setEmail(dto.getEmail());
	    contact.setPhone(dto.getPhone());
	    contact.setMessage(dto.getMessage());

	    return service.addContact(contact);
	}

}
