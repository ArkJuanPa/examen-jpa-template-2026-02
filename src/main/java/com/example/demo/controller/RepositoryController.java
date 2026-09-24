package com.example.demo.controller;

import com.example.demo.model.Repository;
import com.example.demo.repository.IRepositoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/repositories")
@RequiredArgsConstructor
public class RepositoryController {

    @Autowired
    private final IRepositoryRepository repositoryRepository;

    @GetMapping("/eje2")
    public List<Repository> eje2() {

        return repositoryRepository.findDistinctByIsTemplateFalseAndAssignment_Classroom_Teacher_EmailAndAssignment_Deadline("krodriguez@icesi.edu.co" , Timestamp.valueOf("2026-03-15 00:00:00"));
    }
}
