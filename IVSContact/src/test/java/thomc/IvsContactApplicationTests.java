package thomc;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import thomc.entity.Contact;
import thomc.repository.ContactMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IvsContactApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	
	@Autowired
    private ContactMapper contactMapper;
//    @Test
//    public void findAllUsers() {
//        List<Contact> users = contactMapper.getAllContact();
//        assertNotNull(users);
//        assertTrue(!users.isEmpty());
//    }
    @Test
    public void search() {
    	List<Contact> contactes = contactMapper.findByNameContaining("cuong");
        assertNotNull(contactes);
    }
//    @Test
//    public void createUser() {
//        Contact contact = new Contact("CuongThoNTU", "thomc@ntu.edu.vn","0915311008");
//        contactMapper.insertContact(contact);
//
//    }

}
