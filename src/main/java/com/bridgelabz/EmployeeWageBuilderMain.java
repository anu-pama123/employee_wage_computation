package com.bridgelabz;

public class EmployeeWageBuilderMain
{
    public int MaxDay = 20;
    public int MaxHr = 100;
    public int WagePerHr = 20;
    public int empHR = 0;
    EmployeeWageBuilderMain(int MaxDay, int MaxHr, int WagePerHr)
    {
        this.MaxDay=MaxDay;
        this.MaxHr=MaxHr;
        this.WagePerHr=WagePerHr;
        //    this.empHR=empHR;
    }
    public int randomGenerator() // method
    {
        int empWage = 0;
        double employeeCheck;
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
                    this.empHR = 0;
                    break;
            }
            empWage = empWage + (this.empHR * this.WagePerHr);
            day++;
        }
        return empWage;
    }

}
