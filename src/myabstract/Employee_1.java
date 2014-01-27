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
public class ConcreteEmployee extends Employee{
    
    public ConcreteEmployee(String fname, String lname){
        super(fname, lname);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int getEmpID() {
        return empID;
    }
    
    @Override
    public String toString(){
        return "Employee ID: "+ this.empID + "\rEmployee name: " + this.lastName + ", " + this.firstName;
    }
}
