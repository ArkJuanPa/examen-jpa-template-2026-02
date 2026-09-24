package com.example.demo.repository;

import com.example.demo.model.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

@org.springframework.stereotype.Repository
public interface IRepositoryRepository extends JpaRepository<Repository, Long> {

    //Obtener los repositorios derivados (que tengan un repositorio plantilla padre no nulo)
    //cuyo docente titular del Classroom tenga un correo institucional específico y cuya fecha
    //límite de entrega (deadline) sea posterior a una fecha dada

    List<Repository> findDistinctByIsTemplateFalseAndAssignment_Classroom_Teacher_EmailAndAssignment_Classroom_Deadline(String email, Timestamp tiempo);
}
