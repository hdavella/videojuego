/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.electrosoftcar.videojuego.controllers;

import com.electrosoftcar.videojuego.domain.VideoJuego;
import com.electrosoftcar.videojuego.service.VideoJuegoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListadoController {
    
    private final VideoJuegoService videoJuegoService;

    public ListadoController(VideoJuegoService videoJuegoService) {
        this.videoJuegoService = videoJuegoService;
    }
    
    @RequestMapping({"/","/home"})
    public String listarVideoJuegos(Model model){
        
        List<VideoJuego> destacados = videoJuegoService.buscarDestacados();
        model.addAttribute("videojuegos",destacados);
        
        return "index";
    }
    
    @RequestMapping("/videojuegoporproveedor")
    public String listarVideoJuegosPorProveedor(int proveedorId, Model model){
        
        List<VideoJuego> juegos = videoJuegoService.findByProvider(proveedorId);
        model.addAttribute("videojuegos",juegos);
        
        return "index";
    }
    
    @RequestMapping("/buscar")
    public String findVideoJuegoName(@RequestParam("q") String consulta, Model model){
        System.out.println(consulta);
        return "index";
    }
}
