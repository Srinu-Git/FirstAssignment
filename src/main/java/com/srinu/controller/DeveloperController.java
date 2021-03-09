package com.srinu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srinu.model.Developer;
import com.srinu.service.DeveloperService;

@RestController
@RequestMapping("/springboot")
public class DeveloperController {

	@Autowired
	private DeveloperService developerService;

	@GetMapping("/developers")
	public List<Developer> getAllEmployees() {
		return developerService.getAllEmployees();
	}

	@GetMapping("/developers/{id}")
	public ResponseEntity<Developer> getEmployeeById(@PathVariable(value = "id") int developerId) {
		return developerService.getEmployeeById(developerId);
	}

	@PostMapping("/developers")
	public Developer createEmployee(@RequestBody Developer developer) {
		return developerService.createEmployee(developer);
	}

	@PutMapping("/developers/{id}")
	public String updateEmployee(@PathVariable(value = "id") int developerId, @RequestBody Developer developerDetails) {
		return developerService.updateEmployee(developerId, developerDetails);
	}

	@DeleteMapping("/developers/{id}")
	public String deleteEmployee(@PathVariable(value = "id") int developerId) {
		return developerService.deleteEmployee(developerId);
	}
}
