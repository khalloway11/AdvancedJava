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
public class HourlyEmployee extends Employee implements myinterface.HourlyEmployee{
    private double hour_rate;
    private double weeklyHours;
    
    public  HourlyEmployee(String fname, String lname, double pay, double hours){
        super(fname, lname);
        this.hour_rate = pay;
        this.weeklyHours = hours;
    }

    @Override
    public double getHour_rate() {
        return hour_rate;
    }

    @Override
    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    @Override
    public double getWeeklyHours() {
        return weeklyHours;
    }

    @Override
    public void setWeeklyHours(double weeklyHours) {
        this.weeklyHours = weeklyHours;
    }
    
    @Override
    public double getWeeklyWage(){
        return hour_rate * weeklyHours;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\rHourly rate: " + this.hour_rate + "\rHours per week: " + this.weeklyHours;
    }
}
