package com.bl;

public class EmployeeWageMultiCom
{
	
		public static final int fullTime = 1;
		public static final int partTime = 2;
		
		private  String company;
		private  int hrWages;
		private  int workingDays;
		private  int workingHours;
		static double EmpWages;
		
		public EmployeeWageMultiCom(String string, int i, int j, int k) {
			// TODO Auto-generated constructor stub
		}


		public void EmpWageBuilder(String company, int hrWages, int workingDays, int workingHours) {
			this.company=company;
			this.hrWages=hrWages;
			this.workingDays=workingDays;
			this.workingHours=workingHours;
		}

		
		private double CompanyEmpWage(){
			int TotalWorkingHours=0;
			int TotalWorkingDays=0;
			
			double TotalWages = 0;
			while(TotalWorkingHours<=workingHours && TotalWorkingDays <=workingDays ) {
				TotalWorkingDays++;
				int empID= (int) Math.floor(Math.random()*10)%3;
				switch (empID) {
					case fullTime :{
						TotalWorkingHours=8;
						break;
				}
					case partTime :{
						TotalWorkingHours=4;
						break;
				}
					default : {
						TotalWorkingHours=0;
						
					}
				}
				EmpWages = TotalWorkingHours*hrWages*workingDays;
				TotalWages += EmpWages;
			}
			return TotalWages;
			
		}


		public static void main(String[] args)
		{
			
			System.out.println("Welcome to Employee Wage Computation\r\n") ;
			String Reliance="";
			EmployeeWageMultiCom Reliance1 = new EmployeeWageMultiCom("Reliance",20,20,100);
			EmployeeWageMultiCom WalMart = new EmployeeWageMultiCom("WalMart",10,20,100);
			EmployeeWageMultiCom Spencers = new EmployeeWageMultiCom("Spencers",15,20,100);
			
			{	
				System.out.println("Total Monthly wages of "+Reliance1.company+" is : Rs "+Reliance1.CompanyEmpWage());
			    System.out.println("Total Monthly wages of "+WalMart.company+" is : Rs "+WalMart.CompanyEmpWage());
			    System.out.println("Total Monthly wages of "+Spencers.company+" is : Rs "+Spencers.CompanyEmpWage());
			}}}
				