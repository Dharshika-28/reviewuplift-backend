package com.feedback.reviewuplift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feedback.reviewuplift.entity.UserEntity;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
     boolean existsByEmail(String email);
    Optional<UserEntity> findByEmail(String email);
}
