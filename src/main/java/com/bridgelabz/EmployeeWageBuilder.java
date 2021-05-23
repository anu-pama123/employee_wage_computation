package com.bridgelabz;

public class EmployeeWageBuilder
{
    public static double Employee_check;
    public static final int IS_PRESENT=1;
    public static final int WAGE_PER_HOUR=20;
    public static final int FULL_DAY_HOUR=8;
    public static double Daily_Employee_Wage;
    public static void random_generator(int var)// method 1
    {
        Employee_check = Math.floor((Math.random() * 10)) % var;
    }
    public static void employee_wage()// method 2
    {
        Daily_Employee_Wage=(WAGE_PER_HOUR * FULL_DAY_HOUR);
    }
    public static void main(String[] args)
    {
        EmployeeWageBuilder object = new EmployeeWageBuilder();
        object.random_generator(2);
        if (object.Employee_check == object.IS_PRESENT)
        {
            System.out.println("Employee is present");
            object.employee_wage();
            System.out.println("Daily employee wage is = " + object.Daily_Employee_Wage);
        }
        else
        {
            System.out.println("Employee is absent");
        }
    }
}
