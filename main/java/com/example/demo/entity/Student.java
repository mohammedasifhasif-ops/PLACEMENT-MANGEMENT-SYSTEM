package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long roll;

    private String qualification;

    private String course;

    private int year;

    private String hallTicketNo;

    // --- Getters & Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Long getRoll() { return roll; }
    public void setRoll(Long roll) { this.roll = roll; }

    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getHallTicketNo() { return hallTicketNo; }
    public void setHallTicketNo(String hallTicketNo) { this.hallTicketNo = hallTicketNo; }
}
