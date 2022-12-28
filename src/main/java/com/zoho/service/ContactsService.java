package com.zoho.service;

import java.util.List;

import com.zoho.entities.Contacts;


public interface ContactsService {
	public void saveContactsInfo(Contacts contacts);
	public List<Contacts> getAllContacts();
	public Contacts findContactsById(long id);

}
