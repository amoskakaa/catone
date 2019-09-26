package com.example.demo;
import com.example.demo.Models.Match;
import com.example.demo.Models.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Component
public class Test implements CommandLineRunner {

    private final FeignRestClient feignRestClient;

    public Test(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }


    @Override
    public void run(String... args) throws Exception {

        //Register Student
        Student newStudent = feignRestClient.registerStudent(new Student(92494,"Amos "));
        System.out.println("New Student:"+newStudent.toString());

        Match newMatch=feignRestClient.RequestMatch("FEMALE",newStudent.getId());
        System.out.println("New Match:"+newMatch.toString());

     


    }
}

