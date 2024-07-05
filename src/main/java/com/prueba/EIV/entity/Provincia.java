package com.prueba.EIV.entity;

import com.prueba.EIV.entity.enume.EnumGenero;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Provincia {


    @Id
    private String id;
    @Enumerated(EnumType.STRING)
    EnumGenero enumProvincia;



    public Provincia() {
    }

    public Provincia(String id, EnumGenero enumProvincia) {
        this.id = id;
        this.enumProvincia = enumProvincia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EnumGenero getEnumProvincia() {
        return enumProvincia;
    }

    public void setEnumProvincia(EnumGenero enumProvincia) {
        this.enumProvincia = enumProvincia;
    }
}
