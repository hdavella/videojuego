/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.electrosoftcar.videojuego.service;

import com.electrosoftcar.videojuego.domain.VideoJuego;
import com.electrosoftcar.videojuego.repository.VideoJuegoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author HDAVELLA
 */

@Service
public class VideoJuegoService {
    
    public final VideoJuegoRepository videoJuegoRepository;

    public VideoJuegoService(VideoJuegoRepository videoJuegoRepository) {
        this.videoJuegoRepository = videoJuegoRepository;
    }
        
    
    public List<VideoJuego> buscarDestacados(){
        
        return videoJuegoRepository.findAllSql();
                
//        List<VideoJuego> destacados = new ArrayList<>();
//        
//        VideoJuego juego = new VideoJuego();
//        juego.setNombre("juego1");
//        juego.setDescripcion("descripcion juego1");
//        juego.setUrl("url juego 1");
//        destacados.add(juego);
//        
//        juego = new VideoJuego();
//        juego.setNombre("juego2");
//        juego.setDescripcion("descripcion juego2");
//        juego.setUrl("url juego 2");
//        destacados.add(juego);
//        
//        return destacados;
    }
    
    public List<VideoJuego> findByProvider(int proveedorId){
    
        return videoJuegoRepository.findByProvider(proveedorId);
    }
    
    public VideoJuego save(VideoJuego newVideoJuego){
    
        return videoJuegoRepository.save(newVideoJuego);
        
    }
    
}
