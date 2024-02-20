/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.electrosoftcar.videojuego.repository;

import com.electrosoftcar.videojuego.domain.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author HDAVELLA
 */
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {    
    
}
