package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWageBuilder
{
    public static List<CompanyEmpWage> companyEmpWages = new ArrayList<CompanyEmpWage>();
    public static void main(String[] args)
    {
        companyEmpWages.add(new CompanyEmpWage(20, 100, 20));
        int employeeWageInfosys=companyEmpWages.get(0).randomGenerator();//method calling
        System.out.println("Monthly employee wage at Infosys = " + employeeWageInfosys);
        companyEmpWages.add(new CompanyEmpWage(30, 110, 10));
        int employeeWageTcs=companyEmpWages.get(1).randomGenerator();//method calling
        System.out.println("Monthly employee wage at Tcs = " + employeeWageTcs);
    }
}


