package com.prueba.EIV.services;

import com.prueba.EIV.entity.Localidad;

import java.util.Optional;

public interface LocalidadServise {


    Optional<Localidad>buscarPorID(String id);

    Localidad guardarLocalidad(Localidad localidad);



}
