/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiquete.controller;

import com.tiquete.entity.concierto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.tiquete.service.IconciertoService;

/**

 */
@Controller
public class conciertoController {

    @Autowired
    private IconciertoService conciertoService;

 

    @GetMapping("/concierto")
    public String index(Model model) {
        List<concierto> listaconcierto = conciertoService.getAllconcierto();
        model.addAttribute("titulo", "Tabla concierto");
        model.addAttribute("concierto", listaconcierto);
        return "concierto";
    }

    @GetMapping("/conciertoN")
    public String crearconcierto(Model model) {

        model.addAttribute("concierto", new concierto());
        return "crear";
    }

    @PostMapping("/save")
    public String guardarconcierto(@ModelAttribute concierto concierto) {
        conciertoService.saveconcierto(concierto);
        return "redirect:/concierto";
    }

    @GetMapping("/editVerdura/{id}")
    public String editarconcierto(@PathVariable("id") Long idconcierto, Model model) {
        concierto concierto = conciertoService.getconciertoById(idconcierto);

        model.addAttribute("concierto", concierto);

        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String eliminarconcierto(@PathVariable("id") Long idconcierto) {
        conciertoService.delete(idconcierto);
        return "redirect:/concierto";
    }
}
