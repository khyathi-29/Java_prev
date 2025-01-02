package oops;

import java.io.Serializable;

public class Employee implements Serializable {

    private String empName;
    private int empId;
    private String empAdd;
    private int salary;

    public void setEmpAdd(String empAdd) {
        this.empAdd = empAdd;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public int getSalary() {
        return salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpAdd() {
        return empAdd;
    }
    public Employee(){

    }
    public Employee(String empName,String empAdd,int empId,int salary)
    {
        this.empName = empName;
        this.empAdd =empAdd;
        this.salary =salary;
        this.empId = empId;
    }
    @Override
    public String toString(){
        return "Employee" + empName;
    }
}
