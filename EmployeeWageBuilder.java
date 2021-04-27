package employeewage;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Employee Wage Computation Program");

		int IS_FULL_TIME = 1;
		int Wage_Per_Hour = 20;
		int empWorkingHours = 0;

		double empCheck = Math.floor(Math.random() * 10) % 2;
		   if ( empCheck == IS_FULL_TIME ) {
		      System.out.println("Employee is present");
		      empWorkingHours = 8;
		   }
		   else {
			  System.out.println("Employee is Absent");
			  empWorkingHours = 0;
		   }
		int dailyEmployeeWage = Wage_Per_Hour * empWorkingHours;
	        System.out.println("dailyEmployeeWage:"+dailyEmployeeWage);   
	}
}
