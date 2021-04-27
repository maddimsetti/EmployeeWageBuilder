package employeewage;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Employee Wage Computation Program");

	  final int IS_FULL_TIME = 1;
	  final int IS_PART_TIME = 2;
	  int Wage_Per_Hour = 20;
	  int empWorkingHours = 0;
	  int workingDaysPermonth = 20;
	  int total_Salary = 0;

	  for( int day = 1; day <= workingDaysPermonth; day++ )
	  {
		int empCheck = (int) Math.floor(Math.random() * 100) % 3;

		  switch (empCheck) {
		  case IS_FULL_TIME:
		        System.out.println("Employee is present");
		        empWorkingHours = 8;
		        break;
	          case IS_PART_TIME:
			System.out.println("Employee is Present");
			empWorkingHours = 4;
		        break;
		  default:
			System.out.println("Employee is Absent");
			break;
		   }
              int dailyEmployeeWage = Wage_Per_Hour * empWorkingHours;
              System.out.println("Day " + day + " dailyEmployeeWage is " + dailyEmployeeWage);
              total_Salary = total_Salary + dailyEmployeeWage;
	  }
	  System.out.println("Total Salary for a Month:" + total_Salary);
	}
}
