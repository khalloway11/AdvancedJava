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
public class ConcreteEmployee implements myinterface.Employee{
    private String firstName, lastName;
    private int empID;
    private static int empNo = 0;
    
    public ConcreteEmployee(String fname, String lname){
        this.firstName = fname;
        this.lastName = lname;
        this.empID = empNo++;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
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
