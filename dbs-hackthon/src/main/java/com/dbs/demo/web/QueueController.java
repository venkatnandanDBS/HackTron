/**
 * 
 */
package com.dbs.demo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.demo.model.DbsQueue;

/**
 * @author Dinesh
 *
 */

@RestController
@RequestMapping("/queue")
public class QueueController {

	@GetMapping
    public ResponseEntity<List<DbsQueue>> getQueueInformation()
	{
		List<DbsQueue>  queueList=new ArrayList<DbsQueue>();
		//List<EmployeeEntity> list = service.getAllEmployees();

		return new ResponseEntity<List<DbsQueue>>(queueList, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping
	 public void AddingQueue()
		{
			List<DbsQueue>  queueList=new ArrayList<DbsQueue>();
			//List<EmployeeEntity> list = service.getAllEmployees();

			
		} 
	
	

	/*
	 * @GetMapping("/{id}") public ResponseEntity<EmployeeEntity>
	 * getEmployeeById(@PathVariable("id") Long id) throws RecordNotFoundException {
	 * EmployeeEntity entity = service.getEmployeeById(id);
	 * 
	 * return new ResponseEntity<EmployeeEntity>(entity, new HttpHeaders(),
	 * HttpStatus.OK); }
	 * 
	 * @PostMapping("/{createEntities}")
	 * 
	 * @RequestMapping(value ="createEntities",method = RequestMethod.PUT ,produces
	 * = "application/json") public ResponseEntity<EmployeeEntity>
	 * createOrUpdateEmployee(@RequestBody EmployeeEntity employee) throws
	 * RecordNotFoundException {
	 * System.out.println("employee object::"+employee.toString()); EmployeeEntity
	 * updated = service.createOrUpdateEmployee(employee); return new
	 * ResponseEntity<EmployeeEntity>(updated, new HttpHeaders(), HttpStatus.OK); }
	 * 
	 * @DeleteMapping("/{id}") public HttpStatus
	 * deleteEmployeeById(@PathVariable("id") Long id) throws
	 * RecordNotFoundException { service.deleteEmployeeById(id); return
	 * HttpStatus.FORBIDDEN; }
	 */

}
