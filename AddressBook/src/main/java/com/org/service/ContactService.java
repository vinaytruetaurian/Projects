package com.org.service;

import java.util.ArrayList;

import com.org.model.Contact;

public interface ContactService {

	public String addContactService(Contact contact);
	public void updateContactService();
	public void deleteContactService();
	
	ArrayList<Contact> searchContactService(Contact contact);
	
	
}
