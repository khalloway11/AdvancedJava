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
public interface SalaryPlusComissionEmployee {
    public double getComissionRate();
    public void setComissionRate(double comissionRate);
    public double getTotalSalary(double sales);
}
