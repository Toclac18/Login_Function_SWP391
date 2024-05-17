package com.example.Login_Function.service.Impl;

import com.example.Login_Function.dto.TopicDto;
import com.example.Login_Function.entity.Topic;
import com.example.Login_Function.entity.User;
import com.example.Login_Function.reponsitory.TopicReponsitory;
import com.example.Login_Function.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicReponsitory topicReponsitory;
    @Override
    public void save(TopicDto topicDto, User user) {
        LocalDateTime Date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd.MM.yyyy");
        String creationDate = Date.format(formatter);
        Topic topic = new Topic(topicDto.getTitle(),
                creationDate,
                topicDto.getBody(),
                user);
        topicReponsitory.save(topic);
    }

    @Override
    public Topic findTopicById(Integer id) {
        return topicReponsitory.findTopicById(id);
    }

    @Override
    public void delete(Integer id) {
        topicReponsitory.deleteById(id);
    }

    @Override
    public void update(Topic topic) {
        topicReponsitory.save(topic);
    }
}
