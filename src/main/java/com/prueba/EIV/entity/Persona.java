package com.prueba.EIV.entity;

import com.prueba.EIV.entity.enume.EnumGenero;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
public class Persona  implements Serializable {

    @EmbeddedId
    private PersonaId personaId;

    @NotNull(message = "El género no puede estar vacío")
    @Enumerated(EnumType.STRING)
    private EnumGenero genero;

    @ManyToOne
    @JoinColumn(name ="cp")
    @NotNull(message = "  no puede estar vacío")
    private Localidad localidad;

    public Persona() {
    }

    public Persona(PersonaId personaId, EnumGenero genero, Localidad localidad) {
        this.personaId = personaId;
        this.genero = genero;
        this.localidad = localidad;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public void setPersonaId(PersonaId personaId) {
        this.personaId = personaId;
    }

    public EnumGenero getGenero() {
        return genero;
    }

    public void setGenero(EnumGenero genero) {
        this.genero = genero;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
}
