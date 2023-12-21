package dev.korymfargo.phonebookapi.controller;

import dev.korymfargo.phonebookapi.model.Contact;
import dev.korymfargo.phonebookapi.repository.ContactRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    private final ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @GetMapping("/api/contacts")
    public Iterable<Contact> getAllContacts() {
        return this.contactRepository.findAll();
    }

    @PostMapping("/api/contacts")
    public Contact addOneContact(@RequestBody Contact contact) {
        return this.contactRepository.save(contact);
    }
}
