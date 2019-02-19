package com.codeclan.annotations.annotations.repositories;

import com.codeclan.annotations.annotations.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
