package com.prueba.EIV.entity;

import com.prueba.EIV.entity.enume.EnumGenero;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Usuario extends Persona{



    private String usuario;
    private String passwordd;
    private boolean esUsuario;


    public Usuario() {
    }

    public Usuario(String usuario, String passwordd, boolean esUsuario) {
        this.usuario = usuario;
        this.passwordd = passwordd;
        this.esUsuario = esUsuario;
    }

    public Usuario(PersonaId personaId, EnumGenero genero, Localidad localidad, String usuario, String passwordd, boolean esUsuario) {
        super(personaId, genero, localidad);
        this.usuario = usuario;
        this.passwordd = passwordd;
        this.esUsuario = esUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPasswordd() {
        return passwordd;
    }

    public void setPasswordd(String passwordd) {
        this.passwordd = passwordd;
    }

    public boolean isEsUsuario() {
        return esUsuario;
    }

    public void setEsUsuario(boolean esUsuario) {
        this.esUsuario = esUsuario;
    }
}
