//package com.bfs.springmvc.controller;
//
//import com.bfs.springmvc.domain.Contact;
//import com.bfs.springmvc.service.BookService;
//import com.bfs.springmvc.service.ContactService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
//import javax.servlet.http.HttpSession;
//
//@Controller
////@RequestMapping("/contact")
//public class ContactController {
//
//    private ContactService contactService;
//
//
//
//    @Autowired
//    public void setContactService(ContactService contactService) {
//        this.contactService = contactService;
//    }
//
//    //method = RequestMethod.GET
//    @RequestMapping(value="/list_contact", method = RequestMethod.GET)
//    public String getAllContact(Model model) {
//        List<Contact> contactList = contactService.getAllContact();
//        model.addAttribute("contactList", contactList);
//        return "contact";
//    }
//
//}
