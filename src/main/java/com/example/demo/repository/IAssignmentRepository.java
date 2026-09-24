package com.example.demo.repository;

import com.example.demo.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAssignmentRepository extends JpaRepository<Assignment, Long> {

    //Obtener las asignaciones (assignments) de un docente específico (por username del
    //profesor del Classroom) que tienen repositorios con Pull Requests evaluados por un
    //revisor dado (por username) y con un estado de PR determinado.
    List<Assignment> findDistinctByClassroom_Teacher_UsernameAndRepositories_Requests_Reviewer_UsernameAndRepositories_Requests_Status(String teacher ,String reviewer,String status);
}
