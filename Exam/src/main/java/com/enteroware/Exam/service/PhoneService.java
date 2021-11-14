package com.enteroware.Exam.service;

import com.enteroware.Exam.dao.PhoneDao;
import com.enteroware.Exam.dao.RestTempateCaller;
import com.enteroware.Exam.exception.UserNotFoundException;
import com.enteroware.Exam.model.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService {

    private PhoneDao phoneDao;
    private RestTempateCaller restTempateCaller;
    @Autowired
    public PhoneService(PhoneDao phoneDao,RestTempateCaller restTempateCaller) {
        this.phoneDao = phoneDao;
        this.restTempateCaller = restTempateCaller;
    }

    public List<PhoneNumber> getAll(){
        return phoneDao.findAll();
    }

    public PhoneNumber findById(String name){
      PhoneNumber phoneNumber = restTempateCaller
                .getProductList(name);
        return phoneDao.save(phoneNumber);
    }


    public PhoneNumber addPhone(PhoneNumber phoneNumber){

        return phoneDao.save(phoneNumber);
    }
}
