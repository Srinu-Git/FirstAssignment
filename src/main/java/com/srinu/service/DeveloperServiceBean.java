package com.srinu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.srinu.exception.ResourceNotFoundException;
import com.srinu.model.Developer;
import com.srinu.repository.DeveloperRepository;

@Service
public class DeveloperServiceBean implements DeveloperService {

	@Autowired
	private DeveloperRepository developerRepository;

	@Override
	public List<Developer> getAllEmployees() {
		return developerRepository.findAll();
	}

	@Override
	public ResponseEntity<Developer> getEmployeeById(int developerId) {
		Developer employee = null;
		try {
			employee = developerRepository.findById(developerId).orElseThrow(
					() -> new ResourceNotFoundException("Developer not found for this id :: " + developerId));
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok().body(employee);
	}

	@Override
	public String updateEmployee(int developerId, Developer developerDetails) {
		Developer developer = null;
		try {
			developer = developerRepository.findById(developerId).orElseThrow(
					() -> new ResourceNotFoundException("Developer not found for this id :: " + developerId));
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
		developer.setName(developerDetails.getName());
		developer.setSkills(developerDetails.getSkills());
		developerRepository.save(developer);
		return "Developer is updated successfully";

	}

	@Override
	public String deleteEmployee(int developerId) {
		Developer developer = null;
		try {
			developer = developerRepository.findById(developerId).orElseThrow(
					() -> new ResourceNotFoundException("Developer not found for this id :: " + developerId));
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}

		developerRepository.delete(developer);
		return "Developer is deleted sucessfully";
	}

	@Override
	public Developer createEmployee(Developer developer) {
		return developerRepository.save(developer);
	}

}
