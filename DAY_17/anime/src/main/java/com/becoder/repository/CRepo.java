package com.becoder.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.becoder.model.Contact;


public interface CRepo extends JpaRepository<Contact,String>{

}