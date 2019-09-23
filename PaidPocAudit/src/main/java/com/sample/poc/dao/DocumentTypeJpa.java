package com.sample.poc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.poc.domain.DocumentType;

@Repository
public interface DocumentTypeJpa extends JpaRepository<DocumentType, Integer> {

}
