package com.zoho.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing,Long> {

}
