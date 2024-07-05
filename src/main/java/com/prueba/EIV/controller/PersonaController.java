package com.prueba.EIV.controller;

import com.prueba.EIV.entity.Persona;
import com.prueba.EIV.entity.PersonaId;
import com.prueba.EIV.repository.PersonaRepository;
import com.prueba.EIV.services.PersonaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class PersonaController {

    @Autowired
    PersonaService personaService;



    @PostMapping()
    public ResponseEntity<?> guadarPersona(@Valid @RequestBody Persona persona, BindingResult result) throws Exception {
        if (result.hasErrors()) {
            return validar(result);
        }
        if (persona.getGenero().equals("")){
            return ResponseEntity.badRequest().body(Collections.singletonMap("mensaje",
                    "DNI NO PUEDE ESTAR EN BLANCO"));
        }


        return ResponseEntity.status(HttpStatus.CREATED).body(personaService.guardar(persona));
    }
    @DeleteMapping("/{tipoDocumento}/{numeroDocumento}")
    public ResponseEntity<?> eliminar( @PathVariable String tipoDocumento,
                                      @PathVariable String numeroDocumento){

        personaService.eliminar(tipoDocumento,numeroDocumento);


        return null;
    }

    private ResponseEntity<Map<String, String>> validar(BindingResult result) {
        Map<String, String> errores = new HashMap<>();
        result.getFieldErrors().forEach(err -> {
            errores.put(err.getField()," El campo "+ err.getField()+ " " + err.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errores);
    }




}
