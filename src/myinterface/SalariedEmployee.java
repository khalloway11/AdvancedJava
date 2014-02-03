/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author Keiji
 */
public class SalariedEmployee implements Employee{
    private String firstName;
    private String lastName;
    private int empID;
    private double salary;
    
    public SalariedEmployee(String fname, String lname, double salary, int empID){
        this.firstName = fname;
        this.lastName = lname;
        this.salary = salary;
        this.empID = empID;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setEmpID(int empID){
        this.empID = empID;
    }
    
    
    public int getEmpID(){
        return this.empID;
    }
    
    public double getYearlyPay(){
        return salary;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\rAnnual salary: $" + this.salary;
    }
}
