package com.example.orm.jpa;

import java.util.UUID;

import org.springframework.stereotype.Component;
@Component
public class InMemoryUniqueIdGenerator implements UniqueIdGenerator<UUID> {

    @Override
    public UUID getNextUniqueId() {
        return UUID.randomUUID();
    }

}