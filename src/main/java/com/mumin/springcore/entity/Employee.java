package com.mumin.springcore.entity;

public class Employee {

  private int empId;
  private String empName;
  private String empAddress;

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public String getEmpAddress() {
    return empAddress;
  }

  public void setEmpAddress(String empAddress) {
    this.empAddress = empAddress;
  }

  public void displayInfo() {
    System.out.println("Id: " + empId);
    System.out.println("Name: " + empName);
    System.out.println("Address: " + empAddress);
  }
}
