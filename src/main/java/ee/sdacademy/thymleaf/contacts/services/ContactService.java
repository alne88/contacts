package ee.sdacademy.thymleaf.contacts.services;

import ee.sdacademy.thymleaf.contacts.domain.Phone;
import ee.sdacademy.thymleaf.contacts.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ee.sdacademy.thymleaf.contacts.domain.Contact;
import ee.sdacademy.thymleaf.contacts.repository.ContactRepository;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    private PhoneRepository phoneRepository;

    @Transactional
    public void save(Contact contact) {
        contactRepository.save(contact);
    }

    public Contact get(Integer id) {
        return contactRepository.findById(id).get();
    }

    public List<Contact> getAll(){
        return contactRepository.findAll();
    }

    public List<Phone> findPhonesById(Integer id){
        return phoneRepository.findAllByContactid(id);
    }
}
