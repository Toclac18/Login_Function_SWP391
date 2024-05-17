package com.example.Login_Function.service.Impl;

import com.example.Login_Function.entity.Comment;
import com.example.Login_Function.entity.Reacts;
import com.example.Login_Function.entity.Topic;
import com.example.Login_Function.entity.User;
import com.example.Login_Function.reponsitory.CommentReponsitory;
import com.example.Login_Function.reponsitory.ReactReponsitory;
import com.example.Login_Function.service.ReactService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ReactServiceImpl implements ReactService {
    @Autowired
    private ReactReponsitory reactReponsitory;

    @Autowired
    private CommentReponsitory commentReponsitory;

    @Override
    public void saveReactTopic(String namereact, Topic topic, User user) {
        reactReponsitory.save(new Reacts(
                namereact,
                user,
                topic,
                null
        ));
    }

    @Override
    public void saveReactComment(String namereact, Comment comment, User user) {
        reactReponsitory.save(new Reacts(
                namereact,
                user,
                null,
                comment
        ));
    }

    @Override
    public int countReact(Topic topic) {
        List<Reacts> listreact= reactReponsitory.findReactsByTopic(topic);
        int up=0,down=0;

        for(Reacts reacts:listreact){
            if(reacts.getName().equals("up")) up++;
            else down++;
        }
        return up-down;
    }

    @Override
    public int countReactComment(Comment comment) {
        List<Reacts> listreact= reactReponsitory.findReactsByComment(comment);
        int up=0,down=0;

        for(Reacts reacts:listreact){
            if(reacts.getName().equals("up")) up++;
            else down++;
        }
        return up-down;
    }

    @Override
    public void delete(Integer topicId) {
        reactReponsitory.removeAllByTopic_Id(topicId);
        for(Comment comment: commentReponsitory.getAllByTopic_Id(topicId)){
            reactReponsitory.removeAllByComment_Id(comment.getId());
        }
    }
}
