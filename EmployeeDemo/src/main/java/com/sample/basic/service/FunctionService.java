package com.sample.basic.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.basic.dao.FunctionRepository;
import com.sample.basic.domain.Function;

@Service
public class FunctionService {
	
	@Autowired
	FunctionRepository functionJpa;
	
	public Function addFunction(Function function) {
		return functionJpa.save(function);
	}
	
	public Function getByFunctionId(int id) {
		return functionJpa.findById(id).get();
	}
	
	public List<Function> getAllByFunctionName(String functionName) {
		return functionJpa.findAllByFunctionName(functionName);
	}
	
	public Iterable<Function> listAllFunctions() {
		return functionJpa.findAll();
	}
	
	public long noOfFunctions() {
		return functionJpa.count();
	}
	
	@Transactional
	public void removeByFunctionId(int id) {
		functionJpa.deleteById(id);
	}
	
	@Transactional
	public int removeAllByFunctionName(String functionName) {
		return functionJpa.deleteAllByFunctionName(functionName);
	}
	
	@Transactional
	public void removeAllFunctions() {
		functionJpa.deleteAll();
	}
}
