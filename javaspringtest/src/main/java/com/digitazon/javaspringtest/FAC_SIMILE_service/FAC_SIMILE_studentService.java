package com.digitazon.javaspringtest.FAC_SIMILE_service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

//I am creating a FAKE-SERVICE-CLASS to test "tests"
//Go to to folder test!

@Service
public class FAC_SIMILE_studentService {

    public List<String> getStudents() {

        List<String> students = new ArrayList<String>();
        students.add("Dave");
        students.add("Alex");

        return students;
    }

    // I created an ArrayList "students" to use it for testing!

}
