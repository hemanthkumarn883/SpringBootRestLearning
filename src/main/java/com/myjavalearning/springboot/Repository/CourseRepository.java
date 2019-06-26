package com.myjavalearning.springboot.Repository;

import org.springframework.data.repository.CrudRepository;

import com.myjavalearning.springboot.domain.Course;

public interface CourseRepository extends CrudRepository<Course, Integer>{

}
