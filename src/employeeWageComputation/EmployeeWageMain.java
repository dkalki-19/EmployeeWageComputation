package employeeWageComputation;

public class EmployeeWageMain {
	 public static void main(String[] args) {
	        System.out.println("Welcome to Employee Wage Computation Program");
	        EmployeeWageBuilder emp = new EmployeeWageBuilder();
	        emp.checkAttendance();
	        
	        System.out.println("\nUC2: Calculate Daily Wage");
	        emp.calculateDailyWage();
	        
	        System.out.println("\nUC3: Part Time Wage");
	        emp.calculatePartTimeWage();
	        
	        System.out.println("\nUC4: Wage Calculation using Switch Case");
	        emp.calculateWageUsingSwitch();
	        
	        System.out.println("\nUC5: Monthly Wage for 20 Days");
	        emp.calculateMonthlyWage();
	        
	        System.out.println("\nUC: W6&7 age Till Condition (100 hrs or 20 days)");
	        emp.calculateWageTillCondition();
	        
	        System.out.println("\nUC8: Multiple Companies");
	        emp.computeEmpWage("TCS", 20, 20, 100);
	        emp.computeEmpWage("Infosys", 22, 22, 120);

	 }
}
