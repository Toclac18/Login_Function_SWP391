package com.example.Login_Function.service;

import com.example.Login_Function.entity.Tags;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TagsService {
    List<Tags> getListTag();
}
