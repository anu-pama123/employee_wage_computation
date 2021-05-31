package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class EmployeeWageBuilder implements EmployeeWage
{
    public static List<CompanyEmpWage> companyEmpWages = new ArrayList<CompanyEmpWage>();
    public static HashMap<String, CompanyEmpWage> companyEmpWageHashMap = new HashMap<>();


    public void  addCompanyEmpWage(String company, int MaxDay, int MaxHr, int WagePerHr)
    {
        CompanyEmpWage obj=new CompanyEmpWage(company, MaxDay, MaxHr, WagePerHr);
        companyEmpWages.add(obj);
        companyEmpWageHashMap.put(company, obj);
    }

    public void computeEmpWage()
    {
        for (int i=0; i<companyEmpWages.size(); i++)
        {
            CompanyEmpWage obj= companyEmpWages.get(i);
            obj.setTotalEmpWage(obj.randomGenerator());
        }
    }

    public int getTotalWage(String company)
    {
        return companyEmpWageHashMap.get(company).totalEmpWage;
    }

    public static void main(String[] args)
    {
        EmployeeWageBuilder obj = new  EmployeeWageBuilder();
        obj.addCompanyEmpWage("infosys", 20, 100, 30);
        obj.addCompanyEmpWage("tcs", 25, 110, 40);
        obj.computeEmpWage();
        System.out.println("Total wage TCS "+obj.getTotalWage("infosys"));
    }
}


