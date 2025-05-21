package com.feedback.reviewuplift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feedback.reviewuplift.entity.BusinessDetailsEntity;

@Repository
public interface BusinessDetailsRepository extends JpaRepository<BusinessDetailsEntity,Long> {

}
