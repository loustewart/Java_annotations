package com.codeclan.annotations.annotations.repositories;

import com.codeclan.annotations.annotations.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
