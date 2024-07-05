package com.prueba.EIV.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Localidad {

    @Id
    private String cp;

    private String localidad;

    //@ManyToOne
    //@NotNull(message = " hace falta ")
    //private Provincia provincia;


    public Localidad() {
    }

    public Localidad(String cp, String localidad) {
        this.cp = cp;
        this.localidad = localidad;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
