package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zoho.entities.Contacts;
import com.zoho.service.ContactsService;

@Controller
public class ContactsController {
	@Autowired
	private ContactsService contactsService;
	//http://localhost:8080/listcontacts
	@RequestMapping("/listcontacts")
	public String listContacts(Model model) {
		List<Contacts> contacts = contactsService.getAllContacts();
		model.addAttribute("contacts", contacts);
	
		return "list_contacts";

}
}
