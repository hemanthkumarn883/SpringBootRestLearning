/*
 * package com.myjavalearning.springboot.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.myjavalearning.springboot.domain.Topic; import
 * com.myjavalearning.springboot.service.CourseService;
 * 
 * @RestController public class CourseController {
 * 
 * @Autowired CourseService CourseService;
 * 
 * @RequestMapping("/courses") public List<Topic> GetAllTopics() { return
 * CourseService.getAllTopics(); }
 * 
 * @RequestMapping("/topics/{Id}") public Topic getCourseById(@PathVariable
 * Integer Id) { return CourseService.getTopicById(Id); }
 * 
 * @RequestMapping(method = RequestMethod.POST, value = "/topics") public void
 * addTopic(@RequestBody Topic topic) {
 * 
 * System.out.println(" topic object  "+topic.toString());
 * CourseService.addTopic(topic);
 * 
 * }
 * 
 * @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}") public
 * void updateTopic(@RequestBody Topic topic, @PathVariable Integer id) {
 * System.out.println(" current topic to update "+topic);
 * CourseService.updateTopic(id,topic);
 * 
 * }
 * 
 * @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}") public
 * void deleteTopic(@PathVariable Integer id) { CourseService.deleteTopic(id);
 * 
 * }
 * 
 * }
 */