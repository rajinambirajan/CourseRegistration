package com.example.CourseRegistration.controller;

import com.example.CourseRegistration.model.Course;
import com.example.CourseRegistration.model.CourseRegistry;
import com.example.CourseRegistration.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CourseController {
    @Autowired
    CourseService service;

    @GetMapping("course")
    public List<Course> availablecourses(){
        return service.availablecourses();
    }
    @GetMapping("course/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return service.enrolledStudents();
    }

    @PostMapping("course/register")
    public String enrolledCourse(@RequestParam("name") String name,@RequestParam("emailId") String emailId,@RequestParam("courseName") String courseName){
        service.enrolledCourse(name,emailId,courseName);
        return "Congratulations! "+name+" you have enrolled for the Course"+courseName;
    }

}
