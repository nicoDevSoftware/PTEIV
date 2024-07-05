package com.prueba.EIV.services;


import com.prueba.EIV.entity.Localidad;
import com.prueba.EIV.entity.Persona;
import com.prueba.EIV.entity.PersonaId;
import com.prueba.EIV.entity.enume.EnumGenero;
import com.prueba.EIV.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    @Autowired
    LocalidadServise localidadServise;


    @Override
    public Persona  guardar(Persona persona) throws Exception {
        Persona personaNew=persona;
        Optional<Localidad> localidad =localidadServise.buscarPorID(persona.getLocalidad().getCp());
        if (personaNew.getGenero() == EnumGenero.F || personaNew.getGenero() == EnumGenero.M){
           if (personaNew.getLocalidad().getCp() != null){
               if (localidad.isPresent()){
                   return  personaRepository.save(persona);
               }else{
                   Localidad localidadX=persona.getLocalidad();
                   localidadX=localidadServise.guardarLocalidad(localidadX);
                   personaNew.setLocalidad(localidadX);
                   return personaRepository.save(personaNew);
               }
           }
        };
          throw new Exception("error!!!!!!!!!!");
    }


    @Override
    public Integer buscarLocalidadPorPersona(Persona persona,String idLocalidad) {

    return null;
    }

//    public Optional<Persona> buscarPersonaId(String tipoDocumento, String numeroDocumento) {
//        PersonaId personaId = new PersonaId(tipoDocumento, numeroDocumento);
//        return personaRepository.findById(personaId);
//    }



    @Override
    public Optional<Persona> buscarPorId(Long id) {

        return Optional.empty();
    }

    @Override
    @Transactional
    public ResponseEntity<Object> eliminar(String tipoDocumento, String numeroDocumento) {

        PersonaId id = new PersonaId(tipoDocumento, numeroDocumento);
        //no borra ver
        personaRepository.eliminar(id);
        Optional<Persona> personaNew = personaRepository.findById(id);
        if (personaNew.isPresent()){
            System.out.println("borando");
        }
        System.out.println("no !!!!!!!!!!");
        return null;
    }

    @Override
    public List<Persona> listar() {
        return null;
    }


}
