package com.nix.tryout.collections.maps;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Employee_BadDesign {    
    private long id;    
    private String name;    
    private Date dateOfBirth;    
    private BigDecimal salary;    
    //Getter and Setters    
    // to String    
    @Override    
    public boolean equals(Object o) {        
        if (this == o) return true;        
        if (o == null || getClass() != o.getClass()) return false;        
        Employee_BadDesign employee = (Employee_BadDesign) o;        
        if (id != employee.id) return false;        
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;        
        if (dateOfBirth != null ? !dateOfBirth.equals(employee.dateOfBirth) : employee.dateOfBirth != null) return false;        
        return salary != null ? salary.equals(employee.salary) : employee.salary == null;    
    }    
    @Override    
    public int hashCode() {        
        int result = (int) (id ^ (id >>> 32));        
        result = 31 * result + (name != null ? name.hashCode() : 0);        
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        return result;    
    }
    
    @Override
    public String toString() {
    return this.name;	
    }
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {    
	    HashMap<Employee_BadDesign,String> employeeMap = new HashMap<Employee_BadDesign,String>();  
	    Employee_BadDesign employee1 = new Employee_BadDesign();   
	    
	    employee1.setId(1);   
	    employee1.setName("Sachin");   
	    employee1.setDateOfBirth(new Date(1987,2,1));   
	    employee1.setSalary(new BigDecimal(100000));
	    
	    // Step 1
	    employeeMap.put(employee1,"India");
	    System.out.println(employeeMap);
	    for (Map.Entry<Employee_BadDesign, String> employeeStringEntry : employeeMap.entrySet()) {
	        System.out.println(employeeStringEntry.getKey().hashCode());   
	    }
	    // Step 2
	    // Mutating the Employee Object
	    employee1.setName("Rahul");
	    for (Map.Entry<Employee_BadDesign, String> employeeStringEntry : employeeMap.entrySet()) {
	        System.out.println(employeeStringEntry.getKey().hashCode());    
	    }
	    // The HashMap key is mutated and in the wrong bucket for that hashcode. 
	    // Step 3
	    System.out.println(employeeMap.get(employee1));
	    // Returns null    
	    Employee_BadDesign employee2 = new Employee_BadDesign();   
	    employee2.setId(1);   
	    employee2.setName("Sachin");   
	    employee2.setDateOfBirth(new Date(1987,2,1));   
	    employee2.setSalary(new BigDecimal(100000));
	    System.out.println(employeeMap.get(employee2)); 
	    // Returns null
	}
}
