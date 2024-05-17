package com.example.Login_Function.service;

import com.example.Login_Function.dto.UserDto;
import com.example.Login_Function.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void save(UserDto userDto);
    Boolean checkPasswordUser(String email,String password);
    Boolean checkUserbyEmail(String email);
    User getUserbyEmail(String email);
}
