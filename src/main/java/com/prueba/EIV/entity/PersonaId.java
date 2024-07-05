package com.prueba.EIV.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;


@Embeddable
public class PersonaId implements Serializable {

    private static final long serialVersionUID=1L;
    private String tipoDocumento;
    private String numeroDocumento;


    public PersonaId(String tipoDocumento, String numeroDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public PersonaId() {

    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaId personaId = (PersonaId) o;
        return Objects.equals(tipoDocumento, personaId.tipoDocumento) && Objects.equals(numeroDocumento, personaId.numeroDocumento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoDocumento, numeroDocumento);
    }
}
