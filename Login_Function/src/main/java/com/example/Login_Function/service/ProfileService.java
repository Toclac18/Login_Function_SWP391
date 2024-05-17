package com.example.Login_Function.service;

import com.example.Login_Function.entity.Profile;
import org.springframework.stereotype.Service;

@Service
public interface ProfileService {
    void update(Profile profile);
}
