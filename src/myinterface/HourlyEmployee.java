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
public class HourlyEmployee implements Employee{
    private String firstName;
    private String lastName;
    private int empID;
    private double hourlyRate;
    private double weeklyHours;
    
    public  HourlyEmployee(String fname, String lname, double pay, double hours, int empID){
        this.firstName = fname;
        this.lastName = lname;
        this.empID = empID;
        this.hourlyRate = pay;
        this.weeklyHours = hours;
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
        return (hourlyRate * weeklyHours) * 52;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\rHourly rate: " + this.hourlyRate + "\rHours per week: " + this.weeklyHours;
    }
}
