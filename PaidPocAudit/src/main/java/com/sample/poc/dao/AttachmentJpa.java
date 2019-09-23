package com.sample.poc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.poc.domain.Attachment;

@Repository
public interface AttachmentJpa extends JpaRepository<Attachment, Integer> {

}
