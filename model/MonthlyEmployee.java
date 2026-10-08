package JAVA.EmployeeManagementSystem.model;

import java.time.LocalDate;

public class MonthlyEmployee extends Employee {

    private double monthlySalary;
    private int vacationDays;
    private double bonusPercentage;
    private boolean hasHealthInsurance;

    public MonthlyEmployee(
            int id,
            String name,
            Gender gender,
            LocalDate hireDate,
            double monthlySalary,
            int vacationDays,
            double bonusPercentage,
            boolean hasHealthInsurance) {

        super(id, name, gender, hireDate);

        this.monthlySalary = monthlySalary;
        this.vacationDays = vacationDays;
        this.bonusPercentage = bonusPercentage;
        this.hasHealthInsurance = hasHealthInsurance;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public boolean isHasHealthInsurance() {
        return hasHealthInsurance;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public void setHasHealthInsurance(boolean hasHealthInsurance) {
        this.hasHealthInsurance = hasHealthInsurance;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary + (monthlySalary * bonusPercentage);
    }

    public int calculateAdditionalVacation() {
        if (hasHealthInsurance) {
            return vacationDays + 5;
        }

        return vacationDays;
    }

    @Override
    public String toString() {
        return "MonthlyEmployee{" +
                "id = " + getId() +
                ", name = '" + getName() + '\'' +
                ", gender = " + getGender() +
                ", hireDate = " + getHireDate() +
                ", monthlySalary = " + monthlySalary +
                ", vacationDays = " + vacationDays +
                ", bonusPercentage = " + bonusPercentage +
                ", hasHealthInsurance = " + hasHealthInsurance +
                ", salary = " + calculateSalary() +
                '}';
    }
}