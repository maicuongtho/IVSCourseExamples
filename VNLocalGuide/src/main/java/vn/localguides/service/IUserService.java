package vn.localguides.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.localguides.model.AppUser;
@Service
public interface IUserService {
	Iterable<AppUser> findAll();
    List<AppUser> search(String q);
    AppUser findOne(String email);
    void save(AppUser user);
    void delete(int id);
    
    
 
}
