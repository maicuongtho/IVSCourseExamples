package vn.localguides.service;

import java.util.List;

import vn.localguides.model.AppUser;

public interface IUserService {
	Iterable<AppUser> findAll();
    List<AppUser> search(String q);
    AppUser findOne(String email);
    void save(AppUser user);
    void delete(int id);
 
}
