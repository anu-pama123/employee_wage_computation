package com.bridgelabz;

public class CompanyEmpWage
{
    public final String company;
    public final int MaxDay;
    public final int MaxHr;
    public final int WagePerHr;
    public int totalEmpWage;
    public int empHR = 0;
    CompanyEmpWage(String company, int MaxDay, int MaxHr, int WagePerHr)
    {
        this.company=company;
        this.MaxDay=MaxDay;
        this.MaxHr=MaxHr;
        this.WagePerHr=WagePerHr;
        this.totalEmpWage=0;
    }

    public int randomGenerator()
    {
        int empWage = 0;
        double employeeCheck = 0;
        int totalWorkingHr = 0;
        int day = 0;
        while (totalWorkingHr < this.MaxHr && day < this.MaxDay)
        {
            employeeCheck = Math.floor((Math.random() * 10)) % 3;
            switch ((int) employeeCheck)
            {
                case 1: // full time
                    this.empHR = 8;
                    break;
                case 2: //part time
                    this.empHR = 4;
                    break;
                default:
                    this.empHR = 0; //absent
                    break;
            }
            empWage = empWage + (this.empHR * this.WagePerHr);
            System.out.println(empWage);
            day++;
        }
        return empWage;
    }

    public void setTotalEmpWage(int totalEmpWage)
    {
        this.totalEmpWage=totalEmpWage;
    }
    public String toString()
    {
        return "Total Emp Wage for Company : " +company+"is: "+totalEmpWage;
    }

}
