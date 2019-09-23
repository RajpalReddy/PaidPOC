package com.sample.poc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.poc.domain.Invitation;

@Repository
public interface InvitationJpa extends JpaRepository<Invitation, Integer> {

}
