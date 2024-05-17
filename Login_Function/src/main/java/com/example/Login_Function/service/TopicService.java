package com.example.Login_Function.service;

import com.example.Login_Function.dto.TopicDto;
import com.example.Login_Function.entity.Topic;
import com.example.Login_Function.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface TopicService {
    void save(TopicDto topicDto, User user);
    Topic findTopicById(Integer id);
    void delete(Integer id);
    void update(Topic topic);
}
