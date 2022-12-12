/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Employee;

import java.util.ArrayList;


/**
 *
 * @author chandukongara
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList;
   
    public EmployeeDirectory (){
        employeeList = new ArrayList<>();
        }
    
    public ArrayList<Employee> getEmployeeList(){
        return employeeList;
    }
    
    public Employee createEmployee(String EmployeeName) {
        Employee employee = new Employee();
        employee.setName(EmployeeName);
        employeeList.add(employee);
        return employee;
    }
}
