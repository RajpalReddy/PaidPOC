package com.sample.poc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.poc.domain.RfpAssign;

@Repository
public interface RfpAssignJpa extends JpaRepository<RfpAssign, Integer> {

}
