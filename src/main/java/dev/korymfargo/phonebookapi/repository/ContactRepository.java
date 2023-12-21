package dev.korymfargo.phonebookapi.repository;

import dev.korymfargo.phonebookapi.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
