package com.zoho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.Repository.ContactsRepository;
import com.zoho.Repository.LeadRepository;
import com.zoho.entities.Contacts;
import com.zoho.entities.Lead;
@Service
public class ContactsServiceImpl implements ContactsService {
	@Autowired
	private ContactsRepository contactsRepo;

	@Override
	public void saveContactsInfo(Contacts contacts) {
		contactsRepo.save(contacts);
		

	}

	@Override
	public List<Contacts> getAllContacts() {
		List<Contacts> contacts = contactsRepo.findAll();
		return contacts;
	}

	@Override
	public Contacts findContactsById(long id) {
Optional<Contacts> findById = contactsRepo.findById(id);	
Contacts Contacts = findById.get();
return Contacts;
	}

	

}
