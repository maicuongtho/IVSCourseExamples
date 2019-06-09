package vn.localguides.repository;

import org.springframework.data.repository.CrudRepository;

import vn.localguides.model.AppRole;

public interface IRoleRepository extends CrudRepository<AppRole, Integer> {
    AppRole findByName(String name);
}

