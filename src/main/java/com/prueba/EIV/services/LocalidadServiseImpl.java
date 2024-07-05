package com.prueba.EIV.services;

import com.prueba.EIV.entity.Localidad;
import com.prueba.EIV.repository.LocalidadRepository;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocalidadServiseImpl implements LocalidadServise{

    @Autowired
    LocalidadRepository localidadRepository;


    @Override
    public Optional<Localidad> buscarPorID(String id) {
           return localidadRepository.findById(Integer.valueOf(id));

    }

    @Override
    public Localidad guardarLocalidad(Localidad localidad) {
        return localidadRepository.save(localidad);
    }
}
