package com.sample.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.basic.domain.Function;
import com.sample.basic.service.FunctionService;

@RestController
@RequestMapping("/function")
public class FunctionController {
	
	@Autowired
	FunctionService functionService;
	
	@PostMapping("/saveFunction")
	public Function saveFunction(@RequestBody Function function) {
		return functionService.addFunction(function);
	}
	
	@GetMapping("/findByFunctionId")
	public Function findByFunctionId(@RequestParam int id) {
		return functionService.getByFunctionId(id);
	}
	
	@GetMapping("/findAllByFunctionName")
	public List<Function> findAllByFunctionName(@RequestParam String functionName) {
		return functionService.getAllByFunctionName(functionName);
	}
	
	@GetMapping("/findAllFunctions")
	public Iterable<Function> findAllFunctions() {
		return functionService.listAllFunctions();
	}
	
	@GetMapping("/countNoOfFunctions")
	public long countNoOfFunctions() {
		return functionService.noOfFunctions();
	}
	
	@DeleteMapping("/deleteByFunctionId")
	public void deleteByFunctionId(@RequestParam int id) {
		functionService.removeByFunctionId(id);
	}
	
	@DeleteMapping("/deleteAllByFunctionName")
	public int deleteAllByFunctionName(@RequestParam String functionName) {
		return functionService.removeAllByFunctionName(functionName);
	}
	
	@DeleteMapping("/deleteAllFunctions")
	public void deleteAllFunctions() {
		functionService.removeAllFunctions();
	}
}
