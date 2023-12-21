package dev.korymfargo.phonebookapi.controller;

import dev.korymfargo.phonebookapi.model.Contact;
import dev.korymfargo.phonebookapi.repository.ContactRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {
    private final ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @GetMapping("/api/contacts")
    @CrossOrigin(origins = "http://localhost:4200")
    public Iterable<Contact> getAllContacts() {
        return this.contactRepository.findAll();
    }

    @PostMapping("/api/contacts")
    @CrossOrigin(origins = "http://localhost:4200")
    public Contact addOneContact(@RequestBody Contact contact) {
        return this.contactRepository.save(contact);
    }
}
