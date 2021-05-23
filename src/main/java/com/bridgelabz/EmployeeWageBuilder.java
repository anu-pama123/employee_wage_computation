package com.bridgelabz;
public class EmployeeWageBuilder {
    public static double Daily_full_time_Employee_Wage, Daily_part_time_Employee_Wage;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private static double Employee_Wage;
    public static int Employee_wage=0;
    private static double Employee_check;

    public static int random_generator(int wagePerHr)// method 1
    {
        int empHR = 0;
        int empWage = 0;
        int Employee_wage = 0;
        for (int day = 1; day <= 20; day++) 
        {
            Employee_check = Math.floor((Math.random() * 10)) % 3;
            switch ((int) Employee_check) {
                case IS_FULL_TIME:
                    empHR = 8;
                    break;
                case IS_PART_TIME:
                    empHR = 4;
                    break;
                default:
                    empHR = 0;
                    break;
            }
            empWage = empWage + (wagePerHr * empHR);
        } 
        return empWage;

    }
        public static void main(String[] args)
        {
            int empWage = random_generator(20);
            System.out.println("Monthly employee wage = " + empWage);
            
        }

}
