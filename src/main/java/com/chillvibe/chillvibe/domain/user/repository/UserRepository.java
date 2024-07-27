package com.chillvibe.chillvibe.domain.user.repository;

import com.chillvibe.chillvibe.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  Boolean existsByEmail(String email);

  User findByEmail(String email);
}