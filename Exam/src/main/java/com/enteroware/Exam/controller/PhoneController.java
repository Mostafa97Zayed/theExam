package com.enteroware.Exam.controller;

import com.enteroware.Exam.model.PhoneNumber;
import com.enteroware.Exam.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phone")
public class PhoneController {

    private final PhoneService phoneService;


    @Autowired
    public PhoneController(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @GetMapping("")
    public ResponseEntity<List<PhoneNumber>> getAll(){
        List<PhoneNumber> list = phoneService.getAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("/find/{name}")
    public ResponseEntity<PhoneNumber> findbyid(@PathVariable("name") String name){
        PhoneNumber doc = phoneService.findById(name);
        return new ResponseEntity<>(doc,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<PhoneNumber> addDoctor(@RequestBody PhoneNumber doctor){
        PhoneNumber newDoctor = phoneService.addDoctor(doctor);
        return new ResponseEntity<>(newDoctor,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<PhoneNumber> update(@RequestBody PhoneNumber doctor){
        PhoneNumber newDoctor = phoneService.addDoctor(doctor);
        return new ResponseEntity<>(newDoctor,HttpStatus.OK);
    }
}
