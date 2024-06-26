package com.attendance.microservices.attendanceapp.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDetailsResponse {
    List<TeacherDetailsDTO> ownSubjects;
    List<TeacherDetailsDTO> assignedSubjects;
}
