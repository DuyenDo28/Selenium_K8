package lab8_EmployeeExcercise;

import java.util.ArrayList;
import java.util.List;

 class EmployeeController {
    public static float calculateSalaryOfEmployee(List<Employee> employeeList){

        float totalSalary=0;
        for (Employee employee : employeeList) {

            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

}
