package com.bridgelabz;
public class EmployeeWageBuilder
{
    public static void main(String[] args)
    {
        EmployeeWageBuilderMain infosys = new EmployeeWageBuilderMain(20, 100, 20);
        int employeeWageInfosys=infosys.randomGenerator();//method calling
        System.out.println("Monthly employee wage at infosys = " + employeeWageInfosys);
        EmployeeWageBuilderMain tcs = new EmployeeWageBuilderMain(30, 110, 10);
        int employeeWageTcs=infosys.randomGenerator();//method calling
        System.out.println("Monthly employee wage at tcs = " + employeeWageTcs);
    }
}
