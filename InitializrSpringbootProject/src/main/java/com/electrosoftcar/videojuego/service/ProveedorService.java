/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.electrosoftcar.videojuego.service;

import com.electrosoftcar.videojuego.domain.Proveedor;
import com.electrosoftcar.videojuego.repository.ProveedorRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author HDAVELLA
 */

@Service
public class ProveedorService {
    
    public final ProveedorRepository proveedorRepository;

    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }
        
    
    public List<Proveedor> buscarTodo(){
        
        return proveedorRepository.findAll();

    }
    
}
