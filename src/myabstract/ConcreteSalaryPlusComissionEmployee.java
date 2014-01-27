/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

import myconcrete.*;

/**
 *
 * @author Keiji
 */
public class ConcreteSalaryPlusComissionEmployee extends SalaryPlusComissionEmployee{
    private double comissionRate, totalSales;
    
    public ConcreteSalaryPlusComissionEmployee(String fname, String lname, double salary, double comission){
        super(fname, lname, salary);
        this.comissionRate = (comission/100);
        this.totalSales = 0;
    }
    
    public ConcreteSalaryPlusComissionEmployee(String fname, String lname, double salary, double comission, double sales){
        super(fname, lname, salary);
        this.comissionRate = (comission/100);
        this.totalSales = sales;
    }

    @Override
    public double getComissionRate() {
        return comissionRate;
    }

    @Override
    public void setComissionRate(double comissionRate) {
        this.comissionRate = comissionRate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double getComissionEarned(){
        return this.totalSales * this.comissionRate;
    }

    @Override
    public double getTotalSalary(){
        return super.getSalary() + (this.totalSales * this.comissionRate);
    }
    
    @Override
    public String toString(){
        return super.toString() + "\rComission rate: " + this.comissionRate + "\rTotal sales made: $" + this.totalSales + "\rComission earned: $" + this.getComissionEarned() + "\rTotal salary with comission: $" + this.getTotalSalary();
    }
}
