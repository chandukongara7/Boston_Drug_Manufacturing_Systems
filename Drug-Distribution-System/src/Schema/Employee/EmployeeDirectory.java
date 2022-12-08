/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Employee;

import java.util.ArrayList;

/**
 *
 * @author chandukongara
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> EmployeeList;

    public EmployeeDirectory (){
        EmployeeList = new ArrayList<>();
    }
    
    public ArrayList<Employee> getEmployeeList() {
        return EmployeeList;
    }

    public void setEmployeeList(ArrayList<Employee> EmployeeList) {
        this.EmployeeList = EmployeeList;
    }
    
    public Employee createEmployee(String EmployeeName) {
        Employee employee = new Employee();
        employee.setEmployeeName(EmployeeName);
        EmployeeList.add(employee);
        return employee;
    }
    
    
}
