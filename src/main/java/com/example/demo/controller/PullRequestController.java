package com.example.demo.controller;

import com.example.demo.model.PullRequest;
import com.example.demo.repository.IPullRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pull-requests")
@RequiredArgsConstructor
public class PullRequestController {

    @Autowired
    private final IPullRequestRepository pullRequestRepository;

    @GetMapping("/eje1")
    public List<PullRequest> eje1() {

        return pullRequestRepository.findDistinctByRepository_Assignment_Classroom_NameAndStatusOrderByCreatedAtDesc( "Computacion en Internet II - Grupo 1" , "OPEN");
    }

    @GetMapping("/eje3")
    public List<PullRequest> eje3() {

        return pullRequestRepository.findDistinctByReviewer_RoleAndAuthor_UsernameAndRepository_Assignment_Classroom_Semester("TA", "cjimenez" , "2026-02");
    }
}
