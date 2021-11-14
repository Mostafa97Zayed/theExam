package com.enteroware.Exam.controller;

import com.enteroware.Exam.model.PhoneNumber;
import com.enteroware.Exam.service.PhoneService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/phone")
public class PhoneController {

    private final PhoneService phoneService;



    @Autowired
    public PhoneController(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @GetMapping("/find/{name}")
    public ResponseEntity<PhoneNumber> findbyid(@PathVariable("name") String name){
        PhoneNumber doc = phoneService.findById(name);
        return new ResponseEntity<>(doc,HttpStatus.OK);
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<PhoneNumber>> findAll(){
       List<PhoneNumber> doc = phoneService.getAll();
        return new ResponseEntity<>(doc,HttpStatus.OK);
    }



}
