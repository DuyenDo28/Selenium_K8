package lab8_EmployeeExcercise;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee empFulltime1= new FullTimeEmployee();
        Employee empFulltime2= new FullTimeEmployee();
        Employee empFulltime3= new FullTimeEmployee();

        Employee empContract1 = new ContractEmployee();
        Employee empContract2 = new ContractEmployee();

        // Add fulltime Employee and Contract Employee to ArrayList
        List<Employee> empList= new ArrayList<>();
        empList.add(empFulltime1);
        empList.add(empFulltime2);
        empList.add(empFulltime3);

        empList.add(empContract1);
        empList.add(empContract2);

        // print out total salary of Employees (Full time employee and contract employee)
        System.out.printf("Total salary of employee is %.2f", EmployeeController.calculateSalaryOfEmployee(empList));
    }
}
