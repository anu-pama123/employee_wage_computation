package com.bridgelabz;

abstract class EmployeeWageBuilder
{
    int IS_PRESENT=1;
    double Employee_check;
    public abstract void random_generator(int var);//abstract method
    public static void main(String[] args)
    {
        EmployeeWageBuilder object = new B();
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
