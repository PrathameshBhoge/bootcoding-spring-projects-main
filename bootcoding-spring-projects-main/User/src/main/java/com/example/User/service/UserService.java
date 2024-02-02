package com.example.User.service;

import com.example.User.model.ModelUser;
import com.example.User.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public ModelUser createUser(ModelUser user) {
        return userRepository.save(user);
    }

    public ModelUser getUserById(Long userid) {
        Optional<ModelUser> userOptional = userRepository.findById(Math.toIntExact(userid));
        return userOptional.orElse(null);
    }

    public ModelUser updateUser(ModelUser existingUser) {

            return userRepository.save(existingUser);
    }

    public void deleteUserById(Long userId) {
        userRepository.deleteById(Math.toIntExact(userId));
    }
}
