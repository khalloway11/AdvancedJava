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
public abstract class SalariedEmployee extends Employee{
    private double salary;
    
    public SalariedEmployee(String fname, String lname, double salary){
        super(fname, lname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
