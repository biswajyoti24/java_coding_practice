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

        Map<String, Optional<EmployeeDetails>> secondhighestSalaries = employeeDetails.stream().collect(Collectors.groupingBy(EmployeeDetails::getDepartment,Collectors.collectingAndThen(Collectors.toList(),list-> list.stream().sorted(Comparator.comparing(EmployeeDetails::getEmpsalary).reversed()).skip(1).findFirst())));


        secondhighestSalaries.forEach((department,employee) ->{

            System.out.println("Department : "+ department +" Employee : "+employee.get().getEmpsalary());

        });

        List<EmployeeDetails> topThreeSlariedEmployee = employeeDetails.stream().sorted(Comparator.comparing(EmployeeDetails::getEmpsalary).reversed()).limit(3).collect(Collectors.toList());

        for (EmployeeDetails empd : topThreeSlariedEmployee){
            System.out.println(empd.getEmpname()+"->"+empd.getEmpsalary());
        }

        Long thirdsHighestSalary = employeeDetails.stream().map(emp-> emp.getEmpsalary() ).sorted(Comparator.reverseOrder()).skip(2).limit(1).collect(Collectors.toList()).get(0);

        System.out.println(thirdsHighestSalary);

        List<EmployeeDetails> employeeSalaryLessthanThirdHighestSalary = employeeDetails.stream().filter(x-> x.getEmpsalary()<thirdsHighestSalary).collect(Collectors.toList());

        for (EmployeeDetails empd1 : employeeSalaryLessthanThirdHighestSalary){
            System.out.println(empd1.getEmpname()+"->"+empd1.getEmpsalary());
        }

    }
}
