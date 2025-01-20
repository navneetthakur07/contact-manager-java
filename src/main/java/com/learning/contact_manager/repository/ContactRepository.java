package com.learning.contact_manager.repository;

import com.learning.contact_manager.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository <Contact,Integer> {
    // Optional<Contact> findById(Integer s);
    // we can write methods later on.
}
