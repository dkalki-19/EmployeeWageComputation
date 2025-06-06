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
}
