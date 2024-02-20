/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.electrosoftcar.videojuego.controllers;

import com.electrosoftcar.videojuego.domain.Proveedor;
import com.electrosoftcar.videojuego.domain.VideoJuego;
import com.electrosoftcar.videojuego.service.ProveedorService;
import com.electrosoftcar.videojuego.service.VideoJuegoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author HDAVELLA
 */

@Controller
public class AltaVideoJuegoController {
    
    private final ProveedorService proveedorService;
    private final VideoJuegoService videoJuegoService;

    public AltaVideoJuegoController (ProveedorService proveedorService, VideoJuegoService videoJuegoService) {
        this.proveedorService = proveedorService;
        this.videoJuegoService = videoJuegoService;
    }
    
    @RequestMapping("/videojuego/crear")
    public String altaVideoJuego(Model model){
        
        List<Proveedor> proveedores = proveedorService.buscarTodo();
        model.addAttribute("proveedorlista", proveedores);
        model.addAttribute("videojuego", new VideoJuego() );
        return "altavideojuego";
    }
    
    @PostMapping("/videojuego/save")
    public String savegame(VideoJuego videojuego){
        videoJuegoService.save(videojuego);
        System.out.println(videojuego);
        return"redirect:/";
    };

    
    
}
