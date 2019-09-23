package com.sample.poc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.poc.domain.DocumentAssign;

@Repository
public interface DocumentAssignJpa extends JpaRepository<DocumentAssign, Integer> {

}
