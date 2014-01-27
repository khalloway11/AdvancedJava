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
public abstract class SalaryPlusComissionEmployee extends SalariedEmployee implements myinterface.SalaryPlusComissionEmployee{
    private double comissionRate;
    
    public SalaryPlusComissionEmployee(String fname, String lname, double salary, double comission){
        super(fname, lname, salary);
        this.comissionRate = comission;
    }

    @Override
    public double getComissionRate() {
        return comissionRate;
    }

    @Override
    public void setComissionRate(double comissionRate) {
        this.comissionRate = comissionRate;
    }

    public double getTotalSalary(double sales){
        return super.getSalary() * (sales * this.comissionRate);
    }
    
    @Override
    public abstract String toString();
}
