/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiquete.repository;

import com.tiquete.entity.Local;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *

 */
@Repository
public interface LocalRepository extends CrudRepository<Local, Long> {
    
}
