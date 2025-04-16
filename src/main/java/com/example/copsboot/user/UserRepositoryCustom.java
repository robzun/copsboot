package com.example.copsboot.user;

import com.example.orm.jpa.UserId;

public interface UserRepositoryCustom {
    UserId nextId();
}
