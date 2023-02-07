package com.zoho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.entities.Contacts;
import com.zoho.entities.Lead;

public interface ContactRepository extends JpaRepository<Contacts, Long> {

}
