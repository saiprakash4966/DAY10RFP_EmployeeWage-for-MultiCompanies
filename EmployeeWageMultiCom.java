package com.bl;

public class EmployeeWageMultiCom
{
	
		//constants
		public static final int EMP_RATE_PER_HOUR=30;
		//method to calculate daily employee wage of the employee
		private static void calculateDailyWage(int is_fulltime) 
		{}

		private static void calculateDailyWage() {
			

			//variables
			final int fulltime=2;
			final int parttime=1;
			int empHrs=0;
			int empWage=0;
			int empCheck=0;

			empCheck=(int)Math.floor(Math.random()*10) % 2;
			empCheck=(int)Math.floor(Math.random()*10) % 3 ;
			int is_fulltime = 0;
			//System.out.println(empCheck);
			if(empCheck==is_fulltime) 
				empHrs=8;
			else
				empHrs=4;
					if(empCheck==fulltime) 
						empHrs=8;
					else if(empCheck==parttime)
						empHrs=4;
					else
						empHrs=0;

			empWage= EMP_RATE_PER_HOUR * empHrs;
					empWage= EMP_RATE_PER_HOUR * empHrs;

			System.out.println("Emp Wage is "+empWage);
					

		}

		public static void main(String[] args) 
		{
			int is_fulltime=1;
			calculateDailyWage(is_fulltime);

			calculateDailyWage();
		}
	}