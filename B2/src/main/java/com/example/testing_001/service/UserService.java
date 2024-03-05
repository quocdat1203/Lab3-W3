package com.example.testing_001.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.testing_001.repository.UserRepository;
import com.example.testing_001.model.User;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;
    private BCryptPasswordEncoder passwordEncoder ;
    public String addUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);
        return "Thêm user thành công!";
    }
}

