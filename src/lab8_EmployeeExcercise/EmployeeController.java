package lab8_EmployeeExcercise;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {
    public static void main(String[] args) {
        FullTimeEmployee empFulltime = new FullTimeEmployee();
        ContractEmployee empContract = new ContractEmployee();

        // Hard code, set salary for full time employee
        Employee empFulltime1= new Employee();
        empFulltime1.setSalary(50000);
        Employee empFulltime2= new Employee();
        empFulltime2.setSalary(50000);
        Employee empFulltime3= new Employee();
        empFulltime3.setSalary(10000);

        // Hard code, set salary for Contract employee
        Employee empContract1= new Employee();
        empContract1.setSalary(40000);
        Employee empContract2= new Employee();
        empContract2.setSalary(40000);

        // Add fulltime Employee and Contract Employee to ArrayList
        List<Employee> empList= new ArrayList<>();
        empList.add(empFulltime1);
        empList.add(empFulltime2);
        empList.add(empFulltime3);

        empList.add(empContract1);
        empList.add(empContract2);

        float totalSalary=0;

        for (Employee employee : empList) {
            totalSalary=totalSalary+employee.getSalary();
        }
        System.out.printf("Total salary of employee is %f", totalSalary);
    }

}
