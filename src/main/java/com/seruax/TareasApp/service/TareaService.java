package com.seruax.TareasApp.service;

import com.seruax.TareasApp.model.Tarea;
import com.seruax.TareasApp.repository.ITareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {

    @Autowired
    ITareaRepository tareaRepo;

    public List<Tarea> traerTareas(){
        return tareaRepo.findAll();
    }

    public Tarea traerTarea(Long idTarea){
        return tareaRepo.findById(idTarea).orElse(null);
    }

    public boolean editarEstado(Long idTarea){
        Tarea tarea = traerTarea(idTarea);
        tarea.setEstado("Completada");
        return guardarOEditarTarea(tarea);
    }

    public boolean guardarOEditarTarea(Tarea tarea){
        Tarea tareaGuardada = tareaRepo.save(tarea);
        return traerTarea(tareaGuardada.getId()) != null;
    }

    public boolean eliminarTarea(Long idTarea){
        tareaRepo.deleteById(idTarea);
        return traerTarea(idTarea) == null;
    }

}