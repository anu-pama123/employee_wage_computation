package com.bridgelabz;

public class EmployeeWageBuilder
{
    public static double Employee_check;
    public static int IS_PRESENT=1;
    public static void random_generator(int var)// method
    {
        Employee_check = Math.floor((Math.random() * 10)) % var;
    }

    public static void main(String[] args)
    {
        EmployeeWageBuilder object = new EmployeeWageBuilder();
        object.random_generator(2);
        if (object.Employee_check == object.IS_PRESENT)
        {
            System.out.println("Employee is present");
        } else
        {
            System.out.println("Employee is absent");
        }
    }
}
