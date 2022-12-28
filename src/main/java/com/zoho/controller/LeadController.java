package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entities.Billing;
import com.zoho.entities.Contacts;
import com.zoho.entities.Lead;
import com.zoho.service.BillingService;
import com.zoho.service.ContactsService;
import com.zoho.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	
	
	@Autowired
	private ContactsService contactsService;
	
	//http://localhost:8080/create
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public String viewPageLeadForm() {
		return "create_lead";
		
	}
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String saveOneLeadInfo(@ModelAttribute("lead") Lead lead, Model model) {
		leadService.saveLeadInfo(lead);
		model.addAttribute("lead", lead);
		model.addAttribute("msg", "lead is saved!!");
		return "lead_info";
		
	}
	//http://localhost:8080/listleads
	@RequestMapping("/listleads")
	public String listAllLeads(Model model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
		
	}
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.findLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id, Model model) {
		Lead lead = leadService.findLeadById(id);
		Contacts contacts= new Contacts();
		contacts.setFirstName(lead.getFirstName());
		contacts.setLastName(lead.getLastName());
		contacts.setEmail(lead.getEmail());
		contacts.setMobile(lead.getMobile());
		contacts.setSource(lead.getSource());
		contactsService.saveContactsInfo(contacts);
		leadService.deleteLeadById(id);
		List<Contacts> m = contactsService.getAllContacts();
		model.addAttribute("contacts", m);
	
		return "list_contacts";
	}
	
}
