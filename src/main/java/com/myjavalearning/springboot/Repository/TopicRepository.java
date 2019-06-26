package com.myjavalearning.springboot.Repository;

import org.springframework.data.repository.CrudRepository;

import com.myjavalearning.springboot.domain.Topic;

public interface TopicRepository extends CrudRepository<Topic, Integer>{

}
