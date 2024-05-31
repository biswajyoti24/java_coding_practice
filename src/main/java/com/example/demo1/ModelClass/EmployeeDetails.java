package com.example.demo1.ModelClass;

public class EmployeeDetails {
    private Integer empid;
    private String empname;
    private Long empsalary;
    private String department;
    public EmployeeDetails(Integer emid , String emname,Long emsalary,String dept){

        this.department = dept;
        this.empsalary = emsalary;
        this.empname = emname;
        this.empid = emid;

    }
    public EmployeeDetails(){

    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Long getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(Long empsalary) {
        this.empsalary = empsalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
