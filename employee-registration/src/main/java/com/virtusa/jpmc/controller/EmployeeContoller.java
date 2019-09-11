/**
 * 
 */
package com.virtusa.jpmc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.jpmc.dao.EmployeeDAO;
import com.virtusa.jpmc.dto.Employee;

/**
 * @author sarita
 *
 */
@RestController
public class EmployeeContoller {

	@Autowired
	private EmployeeDAO employeeDAO;

	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Employee> getEmployees() {
		List<Employee> list = employeeDAO.getAllEmployees();
		return list;
	}

}
