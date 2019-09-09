package com.poc.springdatajpa.controller;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.springdatajpa.models.Contact;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("v1/contacts")
public class AddressBookController {
	
	Map<String, Contact> contacts = new ConcurrentHashMap<>();
	
	@GetMapping
	public List<Contact> getAllContact() {
		return (List<Contact>)contacts.values();
	}
	
	@GetMapping("{id}")
	@ApiOperation(
			value = "Find contact by id",
			notes = "THis API lets you find conatact using contact id"
			)
	public Contact getContact(
			@ApiParam(value = "id of contact", required = true)
			@PathVariable String id) {
		return contacts.get(id);
	}
	
	@PostMapping
	public Contact addContact(@RequestBody Contact contact) {
		contacts.put(contact.getId(), contact);
		return contacts.get(contact.getId());
	}

}
