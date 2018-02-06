package com.o4s.controller;

//import com.o4s.repository.userRepository;
import com.o4s.service.AddService;
import com.o4s.web.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {

    @Autowired
    AddService insert;

    @Autowired
    MongoTemplate mongoTemplate;

    @RequestMapping("/add2num")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("fname");
        String enroll = request.getParameter("enroll");

        Student student = new Student();

        if(!mongoTemplate.collectionExists(Student.class)){
            mongoTemplate.createCollection(Student.class);
        }

        student.setName(name);
        student.setEnroll(enroll);

        mongoTemplate.insert(student,"student");

        ModelAndView mav = new ModelAndView();
        mav.setViewName("add");
        mav.addObject("result",name+" and "+enroll+" Added Successfully");

        return mav;
    }
}
