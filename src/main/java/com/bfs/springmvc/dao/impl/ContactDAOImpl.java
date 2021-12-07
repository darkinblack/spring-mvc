package com.bfs.springmvc.dao.impl;

import com.bfs.springmvc.dao.ContactDAO;
import com.bfs.springmvc.domain.Contact;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContactDAOImpl implements ContactDAO {
    @Override
    public List<Contact> getAllContact() {
        List<Contact> listContact = new ArrayList<>();

        listContact.add(new Contact("Marry John", "marry.john@gmail.com", "USA"));
        listContact.add(new Contact("Tom Smith", "tomsmith@outlook.com", "UK"));
        listContact.add(new Contact("John Purcell", "john123@yahoo.com", "USA"));
        listContact.add(new Contact("Siva Krishna", "sivakrishna@gmail.com", "USA"));
        listContact.add(Contact.builder().email("john@gmail.com").name("John Doe").country("UK").build());
        listContact.add(Contact.builder().name("Jane Doe").country("USA").build());
        return listContact;
    }
}
