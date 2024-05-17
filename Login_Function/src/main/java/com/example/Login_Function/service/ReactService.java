package com.example.Login_Function.service;

import com.example.Login_Function.entity.Comment;
import com.example.Login_Function.entity.Topic;
import com.example.Login_Function.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface ReactService {
    void saveReactTopic(String namereact, Topic topic, User user);
    void saveReactComment(String namereact, Comment comment, User user);
    int countReact(Topic topic);
    int countReactComment(Comment comment);
    void delete(Integer topicId);
}
