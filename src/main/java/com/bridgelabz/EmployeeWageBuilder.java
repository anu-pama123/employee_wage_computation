package com.bridgelabz;

public class EmployeeWageBuilder
{
<<<<<<< HEAD
    public static void main(String[] args)
    {
        EmployeeWageBuilderMain infosys = new EmployeeWageBuilderMain(20, 100, 20);
        int employeeWageInfosys=infosys.randomGenerator();//method calling
        System.out.println("Monthly employee wage at infosys = " + employeeWageInfosys);
        EmployeeWageBuilderMain tcs = new EmployeeWageBuilderMain(30, 110, 10);
        int employeeWageTcs=infosys.randomGenerator();//method calling
        System.out.println("Monthly employee wage at tcs = " + employeeWageTcs);
=======
    public static CompanyEmpWage objectArray[]=new CompanyEmpWage[2];
    public static void main(String[] args)
    {
        objectArray[0] = new CompanyEmpWage(20, 100, 20);
        int employeeWageInfosys=objectArray[0].randomGenerator();//method calling
        System.out.println("Monthly employee wage at Infosys = " + employeeWageInfosys);
        objectArray[1] = new CompanyEmpWage(30, 110, 10);
        int employeeWageTcs=objectArray[1].randomGenerator();//method calling
        System.out.println("Monthly employee wage at Tcs = " + employeeWageTcs);
>>>>>>> uc10_employy_wage_computation_using_array
    }
}


