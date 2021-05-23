package com.bridgelabz;

public class EmployeeWageBuilder
{
    public static double Daily_full_time_Employee_Wage, Daily_part_time_Employee_Wage;
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int WAGE_PER_HOUR=20;
    public static final int FULL_DAY_HOUR=8;
    public static final int PART_TIME_HOUR=4;
    private static double Employee_check;
    public static void random_generator(int var)// method 1
    {
        Employee_check = Math.floor((Math.random() * 10)) % var;
    }
    public void full_time_employee_wage()// method 2
    {
         Daily_full_time_Employee_Wage=(WAGE_PER_HOUR * FULL_DAY_HOUR);
    }
    public void part_time_employee_wage()// method 3
    {
         Daily_part_time_Employee_Wage=(WAGE_PER_HOUR * PART_TIME_HOUR);
    }
    public static void main(String[] args)
    {
        EmployeeWageBuilder object = new EmployeeWageBuilder();
        object.random_generator(3);
        if (object.Employee_check == object.IS_FULL_TIME)
        {
            System.out.println("Employee is full time present");
            object.full_time_employee_wage();
            System.out.println("Daily full time employee wage is = " + object.Daily_full_time_Employee_Wage);
        }
        else if (object.Employee_check == object.IS_PART_TIME)
        {
            System.out.println("Employee is Part time present");
            object.part_time_employee_wage();
            System.out.println("Daily part time employee wage is = " + object.Daily_part_time_Employee_Wage);
        }
        else {
            System.out.println(" Employee is absent ");
        }
    }
}
