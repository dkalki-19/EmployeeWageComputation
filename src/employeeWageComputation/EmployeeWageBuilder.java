package employeeWageComputation;

import java.util.Random;

public class EmployeeWageBuilder {
	public void checkAttendance() {
        int isPresent = 1;
        int empCheck = new Random().nextInt(2); // 0 or 1
        if (empCheck == isPresent) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
	
	public void calculateDailyWage() {
        int wagePerHour = 20;
        int fullDayHours = 8;
        int isPresent = 1;
        int empCheck = new Random().nextInt(2);
        if (empCheck == isPresent) {
            int dailyWage = wagePerHour * fullDayHours;
            System.out.println("Employee is Present");
            System.out.println("Daily Wage: ₹" + dailyWage);
        } else {
            System.out.println("Employee is Absent. Daily Wage: ₹0");
        }
    }
	
	public void calculatePartTimeWage() {
        int wagePerHour = 20;
        int partTimeHours = 4;
        int empCheck = new Random().nextInt(3); // 0,1,2

        if (empCheck == 1) {
            System.out.println("Part Time Employee");
            System.out.println("Wage: ₹" + (wagePerHour * partTimeHours));
        } else if (empCheck == 2) {
            System.out.println("Full Time Employee");
            System.out.println("Wage: ₹" + (wagePerHour * 8));
        } else {
            System.out.println("Employee Absent. Wage: ₹0");
        }
    }
	
	public int getWorkingHours() {
        int empCheck = new Random().nextInt(3);
        switch (empCheck) {
            case 1: return 4; // Part-time
            case 2: return 8; // Full-time
            default: return 0; // Absent
        }
    }

    public void calculateWageUsingSwitch() {
        int wagePerHour = 20;
        int empHours = getWorkingHours();
        System.out.println("Wage: ₹" + (empHours * wagePerHour));
    }
}
