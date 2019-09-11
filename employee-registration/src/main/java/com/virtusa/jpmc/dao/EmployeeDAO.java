/**
 * 
 */
package com.virtusa.jpmc.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.virtusa.jpmc.dto.Employee;

/**
 * @author sarita
 *
 */
@Repository
public class EmployeeDAO {
	
	private static final Map<Long, Employee> empMap = new HashMap<Long, Employee>();
	
	static {
		Employee emp1 = new Employee(1L, "Sarita", 'F', "Mumbai","Associate Consultant");
        Employee emp2 = new Employee(2L, "Megha", 'F', "New Delhi","Lead Consultant");
        Employee emp3 = new Employee(3L, "Vinod Kumar", 'M', "Mumbai","Lead Consultant");
        Employee emp4 = new Employee(4L, "Venkatesh", 'M', "Hyderabad","Associate Manager");
  
        empMap.put(emp1.getId(), emp1);
        empMap.put(emp2.getId(), emp2);
        empMap.put(emp3.getId(), emp3);
        empMap.put(emp4.getId(), emp4);
	}

	public List<Employee> getAllEmployees() {
		Collection<Employee> c = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(c);
        return list;
	}

}
