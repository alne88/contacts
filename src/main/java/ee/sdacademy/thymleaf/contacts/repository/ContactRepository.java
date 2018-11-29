package ee.sdacademy.thymleaf.contacts.repository;

import org.springframework.data.repository.CrudRepository;

import ee.sdacademy.thymleaf.contacts.domain.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
}
