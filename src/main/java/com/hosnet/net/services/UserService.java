package com.hosnet.net.services;

import com.hosnet.net.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUser();
    public User getUserById(Long id);
    public User createUser(User user);
    public User updateUser(User user, Long id);
    public boolean deleteUser(Long id);
}
