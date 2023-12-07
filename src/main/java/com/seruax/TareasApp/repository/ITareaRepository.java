package com.seruax.TareasApp.repository;

import com.seruax.TareasApp.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITareaRepository extends JpaRepository<Tarea, Long> {
}
