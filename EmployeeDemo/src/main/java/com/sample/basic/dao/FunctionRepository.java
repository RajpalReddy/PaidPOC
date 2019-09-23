package com.sample.basic.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.basic.domain.Function;

@Repository
public interface FunctionRepository extends CrudRepository<Function, Integer>{
	
	public List<Function> findAllByFunctionName(String functionName);
	
	@Modifying
	public int deleteAllByFunctionName(String functionName);
	
}
