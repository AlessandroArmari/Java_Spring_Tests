package com.digitazon.javaspringtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.digitazon.javaspringtest.FAC_SIMILE_service.FAC_SIMILE_studentService;

@SpringBootTest
public class Test_FAC_SIMILE_studentService {

    @Autowired
    FAC_SIMILE_studentService fac_SIMILE_studentService;
    // Here a "wired" the class I want to test
    // you'll found it in "service" folder

    @Test
    void testIfStudentServiceIsNotNull() {

        assertNotNull(fac_SIMILE_studentService);
        System.out.println("The Class fac_SIMILE_studentService isn't NULL!");

        // Here I checked if fac_SIMILE_studentService isn't null
    }

    @Test
    void testIfStudentsListIsEmpty() {
        assertNotNull(fac_SIMILE_studentService.getStudents());
        System.out.println("The List 'students' isn't empty!");

    }

    @Test
    void testIfStudentsListIsSize2() {

        assertEquals(fac_SIMILE_studentService.getStudents().size(), 2);
        System.out.println("The List 'students' has length--->2");

        // I checked if list's length!
    }

}
