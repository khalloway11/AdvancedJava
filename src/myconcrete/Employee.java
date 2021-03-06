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
public class Employee {
    private String firstName, lastName;
    private int empID;
    private static int empNo = 0;
    
    public Employee(String fname, String lname){
        this.firstName = fname;
        this.lastName = lname;
        this.empID = empNo++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmpID() {
        return empID;
    }
    
    @Override
    public String toString(){
        return "Employee ID: "+ this.empID + "\rEmployee name: " + this.lastName + ", " + this.firstName;
    }
}
