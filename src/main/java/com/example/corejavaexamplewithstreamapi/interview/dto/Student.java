package com.example.corejavaexamplewithstreamapi.interview.dto;


public class Student   {

  private Integer studentID;
  private String firstName;
  private String fastName;
  private Integer mark;

  public Student(Integer studentID, String firstName, String fastName, Integer mark) {
    this.studentID = studentID;
    this.firstName = firstName;
    this.fastName = fastName;
    this.mark = mark;
  }

  public Integer getStudentID() {
    return studentID;
  }

  public void setStudentID(Integer studentID) {
    this.studentID = studentID;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFastName() {
    return fastName;
  }

  public void setFastName(String fastName) {
    this.fastName = fastName;
  }

  public Integer getMark() {
    return mark;
  }

  public void setMark(Integer mark) {
    this.mark = mark;
  }

  @Override
  public String toString() {
    return "Student{" +
        "studentID=" + studentID +
        ", firstName='" + firstName + '\'' +
        ", fastName='" + fastName + '\'' +
        ", mark=" + mark +
        '}';
  }



}
