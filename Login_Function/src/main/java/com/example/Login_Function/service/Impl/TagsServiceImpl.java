package com.example.Login_Function.service.Impl;

import com.example.Login_Function.entity.Tags;
import com.example.Login_Function.reponsitory.TagsReponsitory;
import com.example.Login_Function.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagsServiceImpl implements TagsService {
    @Autowired
    private TagsReponsitory tagsReponsitory;
    @Override
    public List<Tags> getListTag() {
        return tagsReponsitory.findAll();
    }
}
