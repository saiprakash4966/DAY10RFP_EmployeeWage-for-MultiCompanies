package com.bl;

public class EmployeeWageMultiCom
{
	
		public static void main(String[] args) {

			//constants
			final int isPart_time=0;
			final int isFull_time=1;

			//variables
			int rateperHour=20;
			
			int salary=0;
			int num_working_days=25;
			int monthlySalary=0;
			int total_emp_hours=0;
			int total_working_days=0;
			int max_hours_inmonth=100;

			while(total_emp_hours <= max_hours_inmonth && total_working_days <= num_working_days ) {
				int empHours=0;
				total_working_days++;
				double empCheck=Math.floor(Math.random()*10) % 2;
				int empcheck=(int)empCheck;

				switch(empcheck){    
				case isFull_time:    
					empHours=8;
					break;  //optional  
				case isPart_time:    
					empHours=4;
					break; 
				default:     
					empHours=0;  
					break;
				} 
				total_emp_hours+=empHours;
				salary=rateperHour*empHours;
				monthlySalary=monthlySalary+salary;
			}
			System.out.println("Employee Salary is "+salary);
			System.out.println("Employee Monthly Salary is "+monthlySalary);
			System.out.println("Employee total Salary is "+total_emp_hours);
		}

	}


			