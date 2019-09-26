package com.example.demo;

import com.example.demo.FeignConfig;
import com.example.demo.Models.Match;
import com.example.demo.Models.Student;
import com.sun.xml.internal.ws.api.message.Attachment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(name = "client", url = "http://10.51.10.111:2200",configuration = FeignConfig.class)
public interface FeignRestClient {
    //Register
     @RequestMapping(method = RequestMethod.POST, value = "students")
     Student registerStudent(@RequestBody Student student);

    //Request match
        @RequestMapping(method = RequestMethod.POST, value = "matches")
       Match RequestMatch(@RequestParam(name = "gender") String gender,@RequestParam(name = "studentId") Long studentId);



}


