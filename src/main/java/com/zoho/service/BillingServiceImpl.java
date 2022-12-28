package com.zoho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.Repository.BillingRepository;
import com.zoho.entities.Billing;
@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	private BillingRepository billingRepo;

	@Override
	public void generateInvoice(Billing billing) {
		billingRepo.save(billing);

	}

}
