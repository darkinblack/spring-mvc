package com.bfs.springmvc.service.impl;

import com.bfs.springmvc.dao.ContactDAO;
import com.bfs.springmvc.domain.Contact;
import com.bfs.springmvc.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    private ContactDAO contactDAO;

    @Autowired
    public void setContactDAO(ContactDAO contactDAO) {
        this.contactDAO = contactDAO;
    }

    @Override
    public List<Contact> getAllContact() {

        List<Contact> contactList = contactDAO.getAllContact();

        //Business logic here

        return contactList
                .stream()
                .filter(contact -> "USA".equalsIgnoreCase(contact.getCountry()))
                .collect(Collectors.toList());
    }
}
