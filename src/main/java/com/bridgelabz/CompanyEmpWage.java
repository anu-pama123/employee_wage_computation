package com.bridgelabz;

public class CompanyEmpWage implements EmployeeWage
{
    public int MaxDay;
    public int MaxHr;
    public int WagePerHr;
    public int empHR = 0;
    CompanyEmpWage(int MaxDay, int MaxHr, int WagePerHr)
    {
        this.MaxDay=MaxDay;
        this.MaxHr=MaxHr;
        this.WagePerHr=WagePerHr;
    }
    public int randomGenerator() // method
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
            day++;
        }
        return empWage;
    }

}
