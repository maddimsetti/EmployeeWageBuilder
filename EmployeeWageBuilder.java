package employeewage;

public class EmployeeWageBuilder {

	  public static final int IS_FULL_TIME = 1;
	  public static final int IS_PART_TIME = 2;
	  public static final int WAGE_PER_HOUR = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Employee Wage Computation Program");

	        int workingDaysPermonth = 20;
	        int empHours_inMonth = 100;

	        int empWorkingHours = 0;
	        int totalEmpWorkingHours =0;
	        int totalWorkingDays = 0;

	        while (totalEmpWorkingHours <= empHours_inMonth && totalWorkingDays < workingDaysPermonth )
	        {

		totalWorkingDays++;
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

		   totalEmpWorkingHours += empWorkingHours;
		   System.out.println("Day# " +totalWorkingDays + "EmpWorkingHours:" +empWorkingHours);
	       }

               int totalEmployeeWage = totalEmpWorkingHours * WAGE_PER_HOUR;
	       System.out.println("Total Salary for a Month:" + totalEmployeeWage);
	}

}
