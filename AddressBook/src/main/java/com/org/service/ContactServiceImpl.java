package com.org.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.model.Contact;
import com.org.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	ContactRepository contactRepo;

	@Override
	public void updateContactService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteContactService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String addContactService(Contact contact) {
	
		if(contactRepo.addContactRepo(contact)){
			return "Contact "+ contact.getFname()+ " "+contact.getLname() +
					" added Successfully";
		}
		
		return "Contact addition Unsuccessfull";
	}

	@Override
	public ArrayList<Contact> searchContactService(Contact contact) {
		
		ArrayList<Contact> contacts=contactRepo.getContact(contact.getFname(),contact.getLname());
		
		// Any other processing can be done if needed here.
		
		return contacts;
		
		
	}

}
