package com.example.CourseRegistration.service;

import com.example.CourseRegistration.model.Course;
import com.example.CourseRegistration.model.CourseRegistry;
import com.example.CourseRegistration.repository.CourseregistryRepo;
import com.example.CourseRegistration.repository.Courserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    Courserepo repo;

    @Autowired
    CourseregistryRepo rep;

    public List<Course> availablecourses() {
        return repo.findAll();
    }


    public List<CourseRegistry> enrolledStudents() {
        return rep.findAll();
    }

    public void enrolledCourse(String name, String emailId, String courseName) {
        CourseRegistry registry=new CourseRegistry(name,emailId,courseName);
        rep.save(registry);
    }
}
