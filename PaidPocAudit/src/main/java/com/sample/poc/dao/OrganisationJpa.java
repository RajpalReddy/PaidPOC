package com.sample.poc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.poc.domain.Organisation;

@Repository
public interface OrganisationJpa extends JpaRepository<Organisation, Integer> {

}
