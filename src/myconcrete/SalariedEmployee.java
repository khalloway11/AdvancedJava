/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myconcrete;

/**
 *
 * @author Keiji
 */
public class SalariedEmployee extends Employee implements myinterface.SalariedEmployee{
    private double salary;
    
    public SalariedEmployee(String fname, String lname, double salary){
        super(fname, lname);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\rAnnual salary: $" + this.salary;
    }
}
