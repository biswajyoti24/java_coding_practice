package com.example.demo1.codepractice;

import com.example.demo1.ModelClass.EmployeeDetails;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindHighestSalaryOfEmployeeDeprtmentWise {
    public static void main(String[] args) {
//        EmployeeDetails employeeDetails = new EmployeeDetails();
        List<EmployeeDetails> employeeDetails = new ArrayList<>();
        employeeDetails.add(new EmployeeDetails(1,"ram", 100000L,"HR"));
        employeeDetails.add(new EmployeeDetails(2,"hari", 170000L,"HR"));
        employeeDetails.add(new EmployeeDetails(3,"gopal", 180000L,"HR"));
        employeeDetails.add(new EmployeeDetails(4,"sam", 120000L,"HR"));
        employeeDetails.add(new EmployeeDetails(5,"syam", 190000L,"IT"));
        employeeDetails.add(new EmployeeDetails(6,"gudu", 106000L,"IT"));
        employeeDetails.add(new EmployeeDetails(7,"sidu", 100700L,"IT"));

        Map<String, Optional<EmployeeDetails>> highestSalaries = employeeDetails.stream().collect(Collectors.groupingBy(EmployeeDetails::getDepartment,Collectors.maxBy(Comparator.comparing(EmployeeDetails::getEmpsalary))));

        highestSalaries.forEach((department,employee) ->{

            System.out.println("Department : "+ department +" Employee : "+employee.get().getEmpsalary());

        });

    }
}
