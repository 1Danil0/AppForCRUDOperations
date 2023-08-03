package com.danilermolenko.spring.my_rest_test;


import com.danilermolenko.spring.my_rest_test.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.sql.SQLOutput;
import java.util.List;

@Component
public class Communication {

    private final String URL ="http://localhost:8080/MyTestRestHibernateMVC/api/students";

    private RestTemplate restTemplate;
    @Autowired
    public Communication(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public List<Student> getAllStudents(){
        ResponseEntity<List<Student>> responseEntity = restTemplate.
                exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Student>>() {});
        List<Student> allStudents = responseEntity.getBody();
        return allStudents;
    }

    public Student getOneStudent(int id){
        Student student = restTemplate.getForObject(URL + "/" + id, Student.class);
        return student;
    }

    public void saveOneStudent(Student student){
        if(student.getId() == 0){
            ResponseEntity<String> entity = restTemplate.postForEntity(URL, student, String.class);
            System.out.println("New Student was added");
        } else{
            restTemplate.put(URL, student);
            System.out.println("Student was updated");
        }
    }
    public void deleteStudent(int id){
        restTemplate.delete(URL + "/" + id);
    }
}
