package com.org.repository;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.org.model.Contact;

@Repository
public class ContactRepositoryImpl implements ContactRepository{

	private static HashMap<String, ArrayList<Contact>> hm = new HashMap<>();
	
	@Override
	public boolean addContactRepo(Contact contact) {
		ArrayList<Contact> contactAl=null;
		//If its the first contact
		try{
		if(hm.get((contact.getFname()+contact.getLname()).trim())==null){
			 contactAl=new ArrayList<>();
			 contact.setCid(contactAl.size()+1);
			 contactAl.add(contact);
			 
			hm.put((contact.getFname()+contact.getLname()).trim(), contactAl);
		}else{
			// Add it to the HashMap and Chain the contact
			contactAl=hm.get(contact.getFname()+contact.getLname().trim());
			contact.setCid(contactAl.size()+1);
			contactAl.add(contact);
			hm.put((contact.getFname()+contact.getLname()).trim(), contactAl);
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return true;
	}

	@Override
	public <T> void updateContactRepo(String field, T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delteContact(String fname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Contact> getContact(String fname,String lname) {
		
	 ArrayList<Contact> alcont = hm.get(fname.trim()+lname.trim());
		
		return alcont;
		
	}

}
