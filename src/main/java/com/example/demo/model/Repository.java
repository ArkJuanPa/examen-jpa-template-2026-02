package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "repositories")
public class Repository {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private boolean isTemplate;

    private boolean isPrivate;

    private Timestamp createdAt;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assignment_id", nullable = false)
    private Assignment assignment;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_repo_id", nullable = false)
    private Repository repository;


    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "repository", cascade = CascadeType.ALL)
    private List<Commit> commits;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "repository", cascade = CascadeType.ALL)
    private List<PullRequest> requests;

}
