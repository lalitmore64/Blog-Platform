package com.lalit.blog.services;

import com.lalit.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
