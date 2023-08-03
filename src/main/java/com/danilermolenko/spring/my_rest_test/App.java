package com.danilermolenko.spring.my_rest_test;

import com.danilermolenko.spring.my_rest_test.configuration.Config;
import com.danilermolenko.spring.my_rest_test.entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Communication communication = context.getBean("communication", Communication.class);
        System.out.println(communication.getAllStudents());
        System.out.println(communication.getOneStudent(2));
//        communication.deleteStudent(6);
        Student student = new Student("Imaginary", "Imaginary", 1, 5.0);
//        student.setId(5);
        communication.saveOneStudent(student);
    }
}
