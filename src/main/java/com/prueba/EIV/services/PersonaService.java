package com.prueba.EIV.services;

import com.prueba.EIV.entity.Persona;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface PersonaService {


    @Transactional
    Persona guardar(Persona persona) throws Exception;
    Optional<Persona> buscarPorId(Long id);
    ResponseEntity<Object> eliminar(String tipoDocumento, String numeroDocumento);
    List<Persona> listar();

    Integer buscarLocalidadPorPersona(  Persona persona,String id);



}





