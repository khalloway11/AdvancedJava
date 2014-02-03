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
public class SalariedEmployee extends Employee{
    private double salary;
    
    public SalariedEmployee(String fname, String lname, double salary){
        super.setFirstName(fname);
        super.setLastName(lname);
        this.salary = salary;
    }

    @Override
    public double getYearlyPay(){
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return "Employee ID: "+ super.getEmpID() + "\rEmployee name: " + super.getLastName() + ", " + super.getFirstName() + "\rAnnual salary: $" + this.salary;
    }
}
