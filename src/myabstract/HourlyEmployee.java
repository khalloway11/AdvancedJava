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
public class HourlyEmployee extends Employee{
    private double hourlyRate;
    private double weeklyHours;
    
    public  HourlyEmployee(String fname, String lname, double pay, double hours){
        super.setFirstName(fname);
        super.setLastName(lname);
        this.hourlyRate = pay;
        this.weeklyHours = hours;
    }

    public double getHour_rate() {
        return hourlyRate;
    }

    public void setHour_rate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(double weeklyHours) {
        this.weeklyHours = weeklyHours;
    }
    
    public double getWeeklyWage(){
        return hourlyRate * weeklyHours;
    }
    
    @Override
    public double getYearlyPay(){
        return (this.getWeeklyWage() * 52);
    }
    
    @Override
    public String toString(){
        return "Employee ID: "+ super.getEmpID() + "\rEmployee name: " + super.getLastName() + ", " + super.getFirstName() + "\rHourly rate: " + this.hourlyRate + "\rHours per week: " + this.weeklyHours;
    }
}
