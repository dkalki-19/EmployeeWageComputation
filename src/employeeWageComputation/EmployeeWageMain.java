package employeeWageComputation;

public class EmployeeWageMain {
	 public static void main(String[] args) {
	        System.out.println("Welcome to Employee Wage Computation Program");
	        EmployeeWageBuilder emp = new EmployeeWageBuilder();
	        emp.checkAttendance();
	        
	        System.out.println("\nUC2: Calculate Daily Wage");
	        emp.calculateDailyWage();
	        
	        System.out.println("\nUC3: Part Time Wage");
	        empWage.calculatePartTimeWage();
	 }
}
