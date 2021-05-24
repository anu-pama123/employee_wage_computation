package com.bridgelabz;
public class EmployeeWageBuilder
{
    public  static final int isFullTime = 1;
    public  static final int isPartTime = 2;
    private  static double employeeWage;
    private  static double employeeCheck;
    public static int randomGenerator(int wagePerHr, int maxHr, int maxDay) // method
    {
        int empHR = 0;
        int empWage = 0;
        int totalWorkingHr=0;
        int day=0;
        while (totalWorkingHr < maxHr && day < maxDay)
        {
            employeeCheck = Math.floor((Math.random() * 10)) % 3;
            switch ((int) employeeCheck)
            {
                case isFullTime:
                    empHR = 8;
                    break;
                case isPartTime:
                    empHR = 4;
                    break;
                default:
                    empHR = 0;
                    break;
            }
            empWage = empWage + (wagePerHr * empHR);
            System.out.println("Daily employee wage = " + empWage);
            day++;
            totalWorkingHr = totalWorkingHr + empHR;
        }
        return empWage;

    }
        public static void main(String[] args)
        {
            employeeWage=EmployeeWageBuilder.randomGenerator(20,100,20);//method calling
            System.out.println("Monthly employee wage = " + employeeWage);
        }

}
