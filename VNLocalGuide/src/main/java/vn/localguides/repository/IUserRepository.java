package vn.localguides.repository;

import org.springframework.data.repository.CrudRepository;

import vn.localguides.model.AppUser;

public interface IUserRepository extends CrudRepository<AppUser, Integer> 
{
    AppUser findByEmail(String email);
    AppUser findBySodienthoai(String sodienthoai);
}
