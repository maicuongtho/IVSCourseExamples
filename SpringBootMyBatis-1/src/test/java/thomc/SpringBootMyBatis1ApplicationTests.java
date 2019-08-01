package thomc;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import thomc.model.User;
import thomc.mapper.IUserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMyBatis1ApplicationTests {

	@Test
	public void contextLoads() {
	}

	
	@Autowired
    private IUserMapper userMapper;
    @Test
    public void findAllUsers() {
        List<User> users = userMapper.findAllUsers();
        assertNotNull(users);
        assertTrue(!users.isEmpty());
    }
    @Test
    public void findUserById() {
        User user = userMapper.findUserById(1);
        assertNotNull(user);
    }
    @Test
    public void createUser() {
        User user = new User("Siva", "siva@gmail.com");
        userMapper.insertUser(user);
//        User newUser = userMapper.findUserById(user.getId());
//        assertEquals("Siva", newUser.getName());
//        assertEquals("siva@gmail.com", newUser.getEmail());
    }
}
