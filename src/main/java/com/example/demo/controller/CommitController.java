package com.example.demo.controller;

import com.example.demo.model.Commit;
import com.example.demo.repository.ICommitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/commits")
@RequiredArgsConstructor
public class CommitController {

    @Autowired
    private final ICommitRepository commitRepository;

    @GetMapping("/eje4")
    public List<Commit> eje4() {
        return commitRepository.findDistinctByRepository_IsTemplateFalseAndRepository_NameAndMessageContainingIgnoreCaseAndLinesAddedGreaterThan("template-jpa-exam", "fix" , 50);
    }
}
