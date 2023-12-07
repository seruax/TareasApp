package com.seruax.TareasApp.controller;

import com.seruax.TareasApp.model.Tarea;
import com.seruax.TareasApp.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TareaController {

    @Autowired
    private TareaService tareaServ;

    @GetMapping({"/", "verListaTareas"})
    public String traerTareas(Model model, @ModelAttribute("mensaje") String mensaje){
        model.addAttribute("listaTareas", tareaServ.traerTareas());
        model.addAttribute("mensaje", mensaje);
        return "VerListaTareas";
    }

    @GetMapping("/editarEstadoTarea/{id}")
    public String editarEstado(@PathVariable Long id, RedirectAttributes redirectAttributes){
        if (tareaServ.editarEstado(id)){
            redirectAttributes.addFlashAttribute("mensaje", "Estado modificado");
            return "redirect:/verListaTareas";
        }
        redirectAttributes.addFlashAttribute("mensaje", "Modificación fallida");
        return "redirect:/verListaTareas";
    }

    @GetMapping("/agregarTarea")
    public String agregarTarea(Model model){
        model.addAttribute("tarea", new Tarea());
        return "AgregarTarea";
    }

    @PostMapping("/guardarTarea")
    public String guardarTarea(Tarea tarea, RedirectAttributes redirectAttributes){
        if (tareaServ.guardarOEditarTarea(tarea)) {
            redirectAttributes.addFlashAttribute("mensaje", "Guardado correctamente");
            return "redirect:/verListaTareas";
        }
        redirectAttributes.addFlashAttribute("mensaje", "Error al guardar");
        return "redirect:/agregarTarea";
    }

    @GetMapping("/editarTarea/{id}")
    public String editarTarea(@PathVariable Long id, Model model){
        model.addAttribute("tarea", tareaServ.traerTarea(id));
        return "EditarTarea";
    }

    @PostMapping("/guardarTareaEditada")
    public String guardarTareaEditada(Tarea tarea, RedirectAttributes redirectAttributes){
        if (tareaServ.guardarOEditarTarea(tarea)) {
            redirectAttributes.addFlashAttribute("mensaje", "Editado correctamente");
            return "redirect:/verListaTareas";
        }
        redirectAttributes.addFlashAttribute("mensaje", "Error al editar");
        return "redirect:/editarTarea" + tarea.getId();
    }

    @GetMapping("/eliminarTarea/{id}")
    public String eliminarTarea(@PathVariable Long id, RedirectAttributes redirectAttributes){
        if (tareaServ.eliminarTarea(id)) {
            redirectAttributes.addFlashAttribute("mensaje", "Eliminado correctamente");
            return "redirect:/verListaTareas";
        }
        redirectAttributes.addFlashAttribute("mensaje", "Error al eliminar");
        return "redirect:/verListaTareas";
    }

}
