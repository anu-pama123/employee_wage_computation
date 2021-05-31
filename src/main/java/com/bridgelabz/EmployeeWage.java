package com.bridgelabz;

interface EmployeeWage
{
    public void  addCompanyEmpWage(String company, int MaxDay, int MaxHr, int WagePerHr);
    public void computeEmpWage();
    public int getTotalWage(String company);
}
