package com.zoho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entities.Billing;
import com.zoho.entities.Contacts;
import com.zoho.service.BillingService;
import com.zoho.service.ContactsService;

@Controller
public class BillingController {
	@Autowired
	private ContactsService contactsService;
	@Autowired
	private BillingService billingService;
	@RequestMapping("/billingInfo")
	public String viewGenerateBillForm(@RequestParam("contactsid") long id, Model model) {
		Contacts m = contactsService.findContactsById(id);
model.addAttribute("contacts", m);	
		return "create_bill";
		
	}
	 @RequestMapping("/generateBill")
		public String generateBill(@ModelAttribute("billing") Billing billing) {
			 billingService.generateInvoice(billing);
			 return "create_bill";
			
		}


}
