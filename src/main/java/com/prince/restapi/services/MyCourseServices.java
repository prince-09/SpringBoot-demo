package com.prince.restapi.services;

import java.util.List;

import com.prince.restapi.entities.Course;

public interface MyCourseServices {

    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public List<Course> addCourse(Course course);
    
}