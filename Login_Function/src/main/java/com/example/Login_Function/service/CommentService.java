package com.example.Login_Function.service;

import com.example.Login_Function.dto.CommentDto;
import com.example.Login_Function.entity.Comment;
import com.example.Login_Function.entity.Topic;
import com.example.Login_Function.entity.User;
import org.springframework.stereotype.Service;


@Service
public interface CommentService {
    void save(CommentDto commentDto, User user, Topic topic);
    int countComment(Topic topic);
    Comment findCommentbyId(Integer id);
    void delete(Integer topicId);

}
