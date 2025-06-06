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
}
