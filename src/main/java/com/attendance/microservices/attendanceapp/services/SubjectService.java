package com.attendance.microservices.attendanceapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.attendance.microservices.attendanceapp.entities.Subjects;

@Service
public interface SubjectService {
    public List<Subjects> getSubjectDetails();
}
