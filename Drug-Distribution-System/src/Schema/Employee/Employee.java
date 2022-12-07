/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Employee;

/**
 *
 * @author chandukongara
 */
public class Employee {
    private String EmployeeName;
    private int EmployeeId;
    private static int count = 1;

    public Employee() {
        EmployeeId = count;
        count++;
    }
    
    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }
    
    @Override
    public String toString(){
        return EmployeeName;
    }
    
}
