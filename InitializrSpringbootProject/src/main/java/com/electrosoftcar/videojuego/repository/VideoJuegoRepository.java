/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.electrosoftcar.videojuego.repository;

import com.electrosoftcar.videojuego.domain.VideoJuego;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author HDAVELLA
 */
public interface VideoJuegoRepository extends JpaRepository<VideoJuego, Integer> {
    
    @Query("select v from VideoJuego v order by v.nombre")
    //@Query(value = "select * from VideoJuego order by nombre", nativequery=true)
    List<VideoJuego> findAllSql();
    
    @Query("select v from VideoJuego v where v.proveedor.id = ?1 order by v.nombre")
    List<VideoJuego> findByProvider(int proveedorId);
    
    
}
