package com.example.Login_Function.reponsitory;

import com.example.Login_Function.entity.relationship.TopicAndTags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface TopicAndTagsRepository extends JpaRepository<TopicAndTags,Integer> {
}
