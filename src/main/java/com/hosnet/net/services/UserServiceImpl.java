package com.hosnet.net.services;

import com.hosnet.net.model.User;
import com.hosnet.net.repository.UserRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    @Getter
    @Setter
    private UserRepository userRepository;
    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user, Long id) {
        User resUser = userRepository.findById(id).get();
        resUser.setUsername(user.getUsername());
        resUser.setEmail(user.getEmail());
        resUser.setPassword(user.getPassword());
        return userRepository.save(resUser);
    }

    @Override
    public boolean deleteUser(Long id) {
        userRepository.deleteById(id);
        return true;
    }
}
