package employeewage;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Employee Wage Computation Program");

	  final int IS_FULL_TIME = 1;
	  final int IS_PART_TIME = 2;
	  int Wage_Per_Hour = 20;
	  int workingDaysPermonth = 20;
	  int empHours_inMonth = 100;

	  int empWorkingHours = 0;
	  int totalEmployeeWage = 0;
	  System.out.printf("%5s     %5s     %5s     %5s\n","Day", "empWorkingHours", "dailyWage", "totalEmpWorkingHours");

	  for(int day = 1, totalEmpWorkingHours = 0; day <= workingDaysPermonth && totalEmpWorkingHours < empHours_inMonth;
				day++, totalEmpWorkingHours += empWorkingHours)
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
              totalEmployeeWage += dailyEmployeeWage;
              System.out.printf("%5d     %5d     %5d     %5d\n",day, empWorkingHours, dailyEmployeeWage, totalEmpWorkingHours + empWorkingHours);           

	  }
	  System.out.println("Total Salary for a Month:" + totalEmployeeWage);
	}
}
