package com.bridgelabz;

    public class B extends EmployeeWageBuilder
    {
        @Override
    public void random_generator(int var) //method
        {
        Employee_check = Math.floor((Math.random() * 10)) % var;

        }
    }
