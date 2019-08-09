package thomc.service;
import java.util.List;

import org.springframework.stereotype.Service;

import thomc.entity.Contact;

public interface ContactService {
    Iterable<Contact> findAll();
    Contact findOne(Integer id);
    void save(Contact contact);
    void delete(Integer id);
    void insert(Contact contact);
    List<Contact> search(String term); 
}