package JAVA.EmployeeManagementSystem.model;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private double hourlyRate;
    private double hoursWorked;
    private double overtimeRate;

    public HourlyEmployee(
            int id,
            String name,
            Gender gender,
            LocalDate hireDate,
            double hourlyRate,
            double hoursWorked,
            double overtimeRate) {

        super(id, name, gender, hireDate);

        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.overtimeRate = overtimeRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateSalary() {

        double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(hoursWorked - 40, 0);

        double regularPay = regularHours * hourlyRate;
        double overtimePay = overtimeHours * overtimeRate;

        return regularPay + overtimePay;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "id = " + getId() +
                ", name = '" + getName() + '\'' +
                ", gender = " + getGender() +
                ", hireDate = " + getHireDate() +
                ", hourlyRate = " + hourlyRate +
                ", hoursWorked = " + hoursWorked +
                ", overtimeRate = " + overtimeRate +
                ", salary=" + calculateSalary() +
                '}';
    }
}