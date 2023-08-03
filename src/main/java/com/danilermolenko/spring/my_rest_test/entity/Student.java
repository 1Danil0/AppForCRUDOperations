package com.danilermolenko.spring.my_rest_test.entity;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int coarse;
    private double avgGrade;

    public Student(){}

    public Student(String name, String surname, int coarse, double avgGrade) {
        this.name = name;
        this.surname = surname;
        this.coarse = coarse;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", coarse=" + coarse +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCoarse() {
        return coarse;
    }

    public void setCoarse(int coarse) {
        this.coarse = coarse;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
