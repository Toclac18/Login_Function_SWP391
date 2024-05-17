package com.example.Login_Function.service.Impl;

import com.example.Login_Function.entity.Profile;
import com.example.Login_Function.reponsitory.ProfileReponsitory;
import com.example.Login_Function.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {
    @Autowired
    private ProfileReponsitory profileReponsitory;

    @Override
    public void update(Profile profile) {
        profileReponsitory.save(profile);
    }
}
