package com.example.copsboot.user;

import com.example.orm.jpa.UserId;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, UserId>, UserRepositoryCustom {
    Optional<User> findByAuthServerId(AuthServerId authServerId);
}
