package com.example.demo.repository;

import com.example.demo.model.PullRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPullRequestRepository extends JpaRepository<PullRequest, Long> {

}
