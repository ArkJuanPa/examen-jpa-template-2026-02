package com.example.demo.repository;

import com.example.demo.model.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryRepository extends JpaRepository<Repository, Long> {

}
