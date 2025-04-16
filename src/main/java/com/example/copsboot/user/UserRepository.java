package com.example.copsboot.user;

import com.example.orm.jpa.UserId;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, UserId>, UserRepositoryCustom {
}
