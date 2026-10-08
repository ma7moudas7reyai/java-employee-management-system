package JAVA.EmployeeManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;

import JAVA.EmployeeManagementSystem.model.CommissionEmployee;
import JAVA.EmployeeManagementSystem.model.Department;
import JAVA.EmployeeManagementSystem.model.Employee;
import JAVA.EmployeeManagementSystem.model.Gender;
import JAVA.EmployeeManagementSystem.model.HourlyEmployee;
import JAVA.EmployeeManagementSystem.model.MonthlyEmployee;

public class Main {

    public static void main(String[] args) {

        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        1,
                        "Ahmed",
                        Gender.MALE,
                        LocalDate.of(2024, 1, 10),
                        8000,
                        0.10,
                        50000
                );

        MonthlyEmployee monthlyEmployee =
                new MonthlyEmployee(
                        2,
                        "Mariam",
                        Gender.FEMALE,
                        LocalDate.of(2023, 6, 15),
                        12000,
                        21,
                        0.05,
                        true
                );

        HourlyEmployee hourlyEmployee =
                new HourlyEmployee(
                        3,
                        "Omar",
                        Gender.MALE,
                        LocalDate.of(2025, 3, 1),
                        150,
                        45,
                        225
                );

        Department department =
                new Department(
                        101,
                        "Information Technology",
                        monthlyEmployee,
                        new ArrayList<>()
                );

        department.addEmployee(commissionEmployee);
        department.addEmployee(monthlyEmployee);
        department.addEmployee(hourlyEmployee);

        System.out.println("===== ALL EMPLOYEES =====");
        department.printAllEmployees();

        System.out.println("\n===== SALARIES =====");

        System.out.println(
                commissionEmployee.getName()
                        + " Salary = "
                        + commissionEmployee.calculateSalary()
        );

        System.out.println(
                monthlyEmployee.getName()
                        + " Salary = "
                        + monthlyEmployee.calculateSalary()
        );

        System.out.println(
                hourlyEmployee.getName()
                        + " Salary = "
                        + hourlyEmployee.calculateSalary()
        );

        System.out.println("\n===== ADDITIONAL VACATION =====");

        System.out.println(
                monthlyEmployee.getName()
                        + " Vacation Days = "
                        + monthlyEmployee.calculateAdditionalVacation()
        );

        System.out.println("\n===== FIND EMPLOYEE =====");

        Employee foundEmployee = department.findEmployee(2);

        if (foundEmployee != null) {
            System.out.println("Found: " + foundEmployee.getName());
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\n===== TOTAL PAYROLL =====");

        System.out.println(
                "Total Payroll = "
                        + department.calculateTotalPayroll()
        );

        System.out.println("\n===== DEPARTMENT =====");

        System.out.println(department);
    }
}