package com.sample.poc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.poc.domain.Rfp;

@Repository
public interface RfpJpa extends JpaRepository<Rfp, Integer> {

}
