package vn.localguides.service;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import vn.localguides.model.AppRole;
import vn.localguides.model.AppUser;
import vn.localguides.repository.IRoleRepository;
import vn.localguides.repository.IUserRepository;

public class UserServiceImpl implements IUserService{
	@Autowired
    private IUserRepository userRepository;
	@Autowired
    private IRoleRepository roleRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
    @Override
    public Iterable<AppUser> findAll() {
        return userRepository.findAll();
    }

//    @Override
//    public List<User> search(String q) {
//        return userRepository.findByNameContaining(q);
//    }

    @Override
    public AppUser findOne(String email)   {
        return userRepository.findByEmail(email);
    }

    @Override
    public void save(AppUser user) {
    	if (userRepository.findByEmail(user.getEmail()) == null) 
    	{
    		user.setEnabled(false);
    		user.setPassword(passwordEncoder.encode(user.getPassword()));
    		HashSet<AppRole> roles = new HashSet<>();
    		roles.add(roleRepository.findByName("ROLE_WORKER"));
    		user.setRoles(roles);
    		userRepository.save(user);
    	}
    }

    @Override
    public void delete(int id) {
    	userRepository.deleteById(id);
    }

	@Override
	public List<AppUser> search(String q) {
		// TODO Auto-generated method stub
		return null;
	}
}
