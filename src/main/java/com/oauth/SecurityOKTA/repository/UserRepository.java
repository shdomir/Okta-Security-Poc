package com.oauth.SecurityOKTA.repository;

import com.oauth.SecurityOKTA.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User getByEmail(String email);
}
