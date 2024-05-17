package com.example.Login_Function.reponsitory;

import com.example.Login_Function.entity.Comment;
import com.example.Login_Function.entity.Reacts;
import com.example.Login_Function.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface ReactReponsitory extends JpaRepository<Reacts,Integer> {
    List<Reacts> findReactsByTopic(Topic topic);
    List<Reacts> findReactsByComment(Comment comment);
    void removeAllByTopic_Id(Integer topicId);
    void removeAllByComment_Id(Integer commentId);
}
