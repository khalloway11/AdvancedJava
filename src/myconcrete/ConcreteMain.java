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
public class ConcreteMain {
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e1 = new Employee("John", "Doe");
        System.out.println(e1.toString());
        e1.setFirstName("Steve");
        e1.setLastName("Johnson");
        System.out.println(e1.toString());
        
        Employee e2 = new Employee("Ron", "McDonald");
        System.out.println(e2.toString());
        
        Employee e3 = new HourlyEmployee("Steve", "Erwin", 7.75, 15);
        System.out.println(e3.toString());
        //System.out.println(e3.getWeeklyWage());   Doesn't compile
        HourlyEmployee e4 = (HourlyEmployee)e3;
        System.out.println(e4.toString());
        System.out.println(e4.getWeeklyWage());
        
        SalariedEmployee e5 = new SalariedEmployee("Charles", "Darwin", 80000);
        System.out.println(e5.toString());
        
        SalaryPlusComissionEmployee e6 = new SalaryPlusComissionEmployee("Bruce", "Wayne", 100000, 30);
        System.out.println(e6.toString());
        e6.setTotalSales(120000);
        System.out.println(e6.toString());
    }
}
