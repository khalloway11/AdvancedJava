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
public interface Employee {

    public String getFirstName();
    public void setFirstName(String firstName);
    public String getLastName();
    public void setLastName(String lastName);
    public void setEmpID(int empID);
    public int getEmpID();
    public double getYearlyPay();
    public String toString();
   
}
