package com.bridgelabz;
public class EmployeeWageBuilder
{
        int empHR = 0;
    public int randomGenerator(String companyName, int wagePerHr, int maxHr, int maxDay) // method
    {
        int empWage = 0;
        int totalWorkingHr=0;
        int day=0;

        double employeeCheck;
        while (totalWorkingHr < maxHr && day < maxDay)
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
            empWage = empWage + (wagePerHr * empHR);
            day++;
            totalWorkingHr = totalWorkingHr + empHR;
        }
        return empWage;

    }
        public static void main(String[] args)
        {
            EmployeeWageBuilder object=new EmployeeWageBuilder();
            int infosysResult=object.randomGenerator("INFOSYS", 20,100,200);//method calling
            System.out.println("Monthly employee wage in INFOSYS = " + infosysResult);
            int tcsResult=object.randomGenerator("TCS", 30,100,200);
            System.out.println("Monthly employee wage in TCS = " + tcsResult);
        }

}