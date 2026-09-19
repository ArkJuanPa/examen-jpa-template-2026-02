package com.example.demo.repository;

import com.example.demo.model.Commit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommitRepository extends JpaRepository<Commit, Long> {

}
