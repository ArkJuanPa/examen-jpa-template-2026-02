package com.example.demo.model;

import java.security.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "commits")
public class Commit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "commit_hash", nullable = false, unique = true)
    private String commitHash;

    @Column(nullable = false)
    private String message;

    @Column(name = "lines_added")
    private Integer linesAdded;
    @Column(name = "lines_deleted")
    private Integer linesDeleted;
    @Column(name = "commit_date")
    private Timestamp commitDate;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "repository_id")
    private Repository repository;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", nullable = false)
    private User author;
}
