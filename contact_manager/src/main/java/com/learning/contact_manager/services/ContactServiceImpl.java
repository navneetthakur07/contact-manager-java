package com.learning.contact_manager.services;

import com.learning.contact_manager.model.Contact;
import java.util.List;
import com.learning.contact_manager.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired // inject the dependencies - by using field injection
    private ContactRepository contactRepository;

    @Override
    public void displayContact() {
        System.out.println("Welcome to contact manager.");
        Contact contact = new Contact();
        contact.setContactName("Aishwariya");
        contact.setAge(24);
        contact.setGender("Female");
        contact.setEmailId("aishwariya@java.com");
        contact.setMobileNumber(1006);

//        System.out.println(contact.getContactName());
        contactRepository.save(contact); // problem is found here
        System.out.println("Object creation done");

        List<Contact> list = contactRepository.findAll();
        list.forEach((n -> System.out.println(n.getContactName())));
        System.out.println(list);


//        Optional<Contact> contactList;
//        contactList = contactRepository.findById(101);
//        contactList.stream().forEach(System.out::println);
    }
}

