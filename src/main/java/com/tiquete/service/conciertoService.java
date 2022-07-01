/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiquete.service;

import com.tiquete.entity.concierto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tiquete.repository.conciertoRepository;

/**
 *

 */
@Service
public class conciertoService implements IconciertoService{
    
    @Autowired      //dependencias
    private conciertoRepository conciertoRepository;

    @Override
    public List<concierto> getAllconcierto() {
      return (List<concierto>)conciertoRepository.findAll();  //Devuelve toda la lista de verduras
    }

    @Override
    public concierto getconciertoById(long id) {
       return conciertoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveconcierto(concierto verdura) {
       conciertoRepository.save(verdura);
    }

    @Override
    public void delete(long id) {
       conciertoRepository.deleteById(id);
    }
}
