package com.prince.restapi.controller;
import java.util.List;
import com.prince.restapi.entities.Course;
import com.prince.restapi.services.MyCourseServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    
    @Autowired
    public MyCourseServices courseServices;

    @GetMapping("/home")
    public String home(){
        return "Home Page";
    }

    //get courset list
    @GetMapping("/courses")
    public List<Course> getCourse(){
        return this.courseServices.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseServices.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public List<Course> addCourse(@RequestBody Course course){
        return this.courseServices.addCourse(course);
    }
}