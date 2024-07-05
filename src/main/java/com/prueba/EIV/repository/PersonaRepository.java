package com.prueba.EIV.repository;

import com.prueba.EIV.entity.Persona;
import com.prueba.EIV.entity.PersonaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface PersonaRepository extends JpaRepository<Persona, PersonaId> {


    @Modifying
    @Query("DELETE FROM Persona p WHERE p.personaId = :personaId")
    void eliminar(@Param("personaId") PersonaId personaId);

}
