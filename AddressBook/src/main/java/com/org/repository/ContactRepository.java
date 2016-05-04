package com.org.repository;

import java.util.ArrayList;

import com.org.model.Contact;

public interface ContactRepository {

	public boolean addContactRepo(Contact contact);
	public <T> void updateContactRepo(String field,T value);
	public void delteContact(String fname);
	public ArrayList<Contact> getContact(String fname, String lname);
}
