package com.org.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.org.model.Contact;
import com.org.service.ContactService;


@Controller
public class AddressBookController {
	
	@Autowired
	ContactService contactService;
	
	@RequestMapping(method=RequestMethod.GET,value="/addContact.action")
	public String addContact(HttpServletRequest req,@ModelAttribute("contact") Contact contact){
		
		System.out.println("in GET addContactPost");
		
		return "AddContact";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addContact.action")
	public @ResponseBody String addContactPost(@ModelAttribute("contact") Contact contact){
		
		System.out.println("in POST addContactPost"+ contact.getEmail());
		
		String status =contactService.addContactService(contact);
		
		return status;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/searchContact")
	public @ResponseBody ArrayList<Contact> searchContact(HttpServletRequest req,@ModelAttribute("contact") Contact contact){
		
		System.out.println("in GET searchContact");
		
		contact.setFname(req.getParameter("fname"));
		contact.setLname(req.getParameter("lname"));
		
		if(req.getParameter("no")!=null)
			contact.setMobno(req.getParameter("no"));
		
		if(req.getParameter("email")!=null)
			contact.setEmail(req.getParameter("email"));
		//	contact.setEmail(email);
		
		//contactService.searchContactService(contact);
		
		return contactService.searchContactService(contact);
	}

}
