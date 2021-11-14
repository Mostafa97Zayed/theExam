package com.enteroware.Exam.dao;

import com.enteroware.Exam.model.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneDao extends JpaRepository<PhoneNumber,Long> {

    PhoneNumber findByFormat (String name);
}
