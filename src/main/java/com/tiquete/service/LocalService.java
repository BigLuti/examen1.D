/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiquete.service;

import com.tiquete.entity.Local;
import com.tiquete.repository.LocalRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 
 */
@Service
public class LocalService implements ILocalService {
    
    @Autowired
    private LocalRepository localRepository;
    
    @Override
    public List<Local> listProvincia(){
        return (List<Local>)localRepository.findAll();}
}
