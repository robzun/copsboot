package com.example.copsboot.user;

import jakarta.persistence.AttributeConverter;

import java.util.UUID;

public class AuthServerIdAttributeConverter implements AttributeConverter<AuthServerId, UUID> {
    @Override
    public UUID convertToDatabaseColumn(AuthServerId attribute) {
        return attribute.value();
    }

    @Override
    public AuthServerId convertToEntityAttribute(UUID dbData) {
        return new AuthServerId(dbData);
    }
}
