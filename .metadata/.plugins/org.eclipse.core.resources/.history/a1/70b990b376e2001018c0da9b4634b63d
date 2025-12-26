package com.binarydevs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.binarydevs.DAO.ContactRepository;
import com.binarydevs.Entities.Contacts;



@Service
public class BinaryDevsService {
	@Autowired
	private ContactRepository contactDao;
	
	public ResponseEntity addContact(Contacts contact) {
		System.out.println(contact);
		try {
			Contacts savedData = contactDao.save(contact);
			return ResponseEntity.ok(savedData);
		}catch(Exception e) {
			System.err.println("Error occurred during saving the data "+e);
			return ResponseEntity.internalServerError().body("Error occurred");
		}
	}

}
