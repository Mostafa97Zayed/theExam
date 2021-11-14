package com.enteroware.Exam.service;

import com.enteroware.Exam.dao.PhoneDao;
import com.enteroware.Exam.exception.UserNotFoundException;
import com.enteroware.Exam.model.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService {

    private PhoneDao phoneDao;
    @Autowired
    public PhoneService(PhoneDao phoneDao) {
        this.phoneDao = phoneDao;
    }

    public List<PhoneNumber> getAll(){
        return phoneDao.findAll();
    }

    public PhoneNumber findById(String name){
        return phoneDao.findByFormat(name);
    }


    public PhoneNumber addDoctor(PhoneNumber phoneNumber){

        return phoneDao.save(phoneNumber);
    }
}
