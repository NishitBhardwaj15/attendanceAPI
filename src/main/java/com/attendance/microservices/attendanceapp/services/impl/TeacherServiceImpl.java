package com.attendance.microservices.attendanceapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.microservices.attendanceapp.entities.Teachers;
import com.attendance.microservices.attendanceapp.repository.TeachersRepository;
import com.attendance.microservices.attendanceapp.services.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeachersRepository teachersRepository;

    @Override
    public List<Teachers> getTeacherDetails() {
        return teachersRepository.findAll();
    }
    
}
