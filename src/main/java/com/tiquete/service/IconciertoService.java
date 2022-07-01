/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiquete.service;

import com.tiquete.entity.concierto;
import java.util.List;

/**
 *

 */
public interface IconciertoService {
    public List<concierto> getAllconcierto();  //Lista de objetos de tipo verdura
    public concierto getconciertoById (long id);
    public void saveconcierto(concierto concierto);  //Nueva fila en la tabla
    public void delete (long id);    //Eliminar fila dado un id
}
