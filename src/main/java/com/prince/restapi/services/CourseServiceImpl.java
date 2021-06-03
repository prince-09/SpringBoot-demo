package com.prince.restapi.services;


import java.util.ArrayList;
import java.util.List;

import com.prince.restapi.entities.Course;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements MyCourseServices {

    List<Course> courseList;

    public CourseServiceImpl() {
        courseList = new ArrayList();
        courseList.add(new Course(132,"Java Core"," Basics of java"));
        courseList.add(new Course(134,"Python Core"," Basics of python"));
    }

    @Override
    public List<Course> getCourses() {
       
        return courseList;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c=null;
        for(int i=0;i<courseList.size();i++){
            if(courseList.get(i).getId()==courseId){
                c= courseList.get(i);
                break;
            }
        }
        return c;
    }

    @Override
    public List<Course> addCourse(Course course) {
        courseList.add(course);
        return courseList;
    }

    
    
}