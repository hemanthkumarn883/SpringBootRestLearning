/*
 * package com.myjavalearning.springboot.service;
 * 
 * import java.util.ArrayList; import java.util.Arrays; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.myjavalearning.springboot.Repository.CourseRepository; import
 * com.myjavalearning.springboot.Repository.TopicRepository; import
 * com.myjavalearning.springboot.domain.Topic;
 * 
 * @Service public class CourseService {
 * 
 * @Autowired CourseRepository CourseRepo;
 * 
 * public List<Topic> getAllCourses() { List<Topic> topics = new
 * ArrayList<Topic>(); CourseRepo.findAll().forEach(topics::add); return topics;
 * }
 * 
 * public Topic getCourseById(Integer id) {
 * 
 * return CourseRepo.findOne(id); }
 * 
 * public void addCourse(Topic topic) {
 * 
 * CourseRepo.save(topic); }
 * 
 * public void updateCoursec(Integer id, Topic topic) {
 * 
 * CourseRepo.save(topic); }
 * 
 * public void deleteCourse(Integer id) {
 * 
 * CourseRepo.delete(id); ; } }
 */