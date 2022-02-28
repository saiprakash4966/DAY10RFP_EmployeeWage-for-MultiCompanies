package com.bl;

public class EmployeeWageMultiCom
{
	

		//declaring constants
		public static final int IS_PART_TIME=1;
		public static final int IS_FULL_TIME=2;
		/*
		 * public static final int EMP_RATE_PER_HOUR=20; public static final int
		 * NUM_OF_WORKING_DAYS=20; public static final int MAX_HRS_IN_MONTH=10;
		 */

		private final String company;
		private final int empRatePerour;
		private final int numOfWorkingDays;
		private final int maxHoursPerMonth;

		//created parametrized constructor
		public EmployeeWageMultiCom(String company, int empRatePerour, int numOfWorkingDays, int maxHoursPerMonth) {
			super();
			this.company = company;
			this.empRatePerour = empRatePerour;
			this.numOfWorkingDays = numOfWorkingDays;
			this.maxHoursPerMonth = maxHoursPerMonth;
		}


		public static void main(String[] args) {
			EmployeeWageMultiCom Reliance=new EmployeeWageMultiCom("Reliance",20,3,20);

			//declaring variables
			int empHours=0,totalEmpHours=0,totalWorkingDays=0;
			while(totalEmpHours <= Reliance.maxHoursPerMonth && totalWorkingDays <= Reliance.numOfWorkingDays ) {

				totalWorkingDays++;
				int empCheck=(int)Math.floor(Math.random()*10) % 2;


				switch(empCheck){    
				case  IS_FULL_TIME:    
					empHours=8;
					break;  //optional  
				case IS_PART_TIME:    
					empHours=4;
					break; 
				default:     
					empHours=0;  
					break;
				}
				totalEmpHours+=empHours;
				System.out.println("Day#:" +totalWorkingDays+"Emp Hr :"+empHours);
			}
			int totalEmpWage=Reliance.empRatePerour*totalEmpHours;
			System.out.println("Total Employee Wage for Company " +Reliance.company+  "  is  " +totalEmpWage);

		}
	}

	


			