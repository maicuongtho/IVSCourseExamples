package thomc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thomc.entity.Contact;
import thomc.repository.ContactMapper;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactMapper contactMapper;

	@Override
	public Iterable<Contact> findAll() {
		 
		return contactMapper.getAllContact();
	}

	@Override
	public Contact findOne(Integer id) {
			return contactMapper.getContactById(id);
	}

	@Override
	public void save(Contact contact) {
		contactMapper.updateContact(contact);
	}

	@Override
	public void delete(Integer id) {
		contactMapper.deleteContact(id);
	}

	@Override
	public void insert(Contact contact) {
		contactMapper.insertContact(contact);
		
	}

	@Override
	public List<Contact> search(String term) {
		 
		return contactMapper.findByNameContaining(term);
	}
}
