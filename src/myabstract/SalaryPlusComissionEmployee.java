/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author Keiji
 */
public abstract class SalaryPlusComissionEmployee extends SalariedEmployee{
    private double comissionRate;
    
    public SalaryPlusComissionEmployee(String fname, String lname, double salary, double comission){
        super(fname, lname, salary);
        this.comissionRate = comission;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(double comissionRate) {
        this.comissionRate = comissionRate;
    }

    public double getTotalSalary(double sales){
        return super.getSalary() * (sales * this.comissionRate);
    }
}
