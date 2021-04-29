package employeewage;

//class Declaration
class EmployeeWageBuilder {

        //constants
        private static final int IS_FULL_TIME = 1;
        private static final int IS_PART_TIME = 2;
        private static final int WAGE_PER_HOUR = 20;
	private static int WORKING_DAYS_PER_MONTH = 20;
	private static int EMP_HOURS_IN_MONTH = 100;

	//variables

	private static int totalEmpWorkingHours,totalWorkingDays,empWorkingHours;

	//Constructor Declaration of class
	public EmployeeWageBuilder () {

		EmployeeWageBuilder.totalEmpWorkingHours = 0;
		EmployeeWageBuilder.totalWorkingDays = 0;
		EmployeeWageBuilder.empWorkingHours = 0;

        }

	//method1
	public static int getempCheck ()
	{

	    return (int) Math.floor(Math.random() * 10) % 3;
	}

	//method2
        public static int gettotalEmployeeWage ()
        {
    	    return totalEmpWorkingHours * WAGE_PER_HOUR;
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Employee Wage Computation Program");


	    while (totalEmpWorkingHours <= EMP_HOURS_IN_MONTH && totalWorkingDays < WORKING_DAYS_PER_MONTH )
	    {

		totalWorkingDays++;

		   switch (getempCheck()) {
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
		      	   empWorkingHours = 0;
			   break;
		   }

		   totalEmpWorkingHours += empWorkingHours;
		   System.out.println("Day# " +totalWorkingDays + " EmpWorkingHours:" +empWorkingHours);
	       }

	       System.out.println("Total Salary for a Month:" + gettotalEmployeeWage());
	}

}
