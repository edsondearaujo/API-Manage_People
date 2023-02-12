package br.com.attornatus.api.resources;

import br.com.attornatus.api.domain.Address;
import br.com.attornatus.api.domain.Person;
import br.com.attornatus.api.domain.dto.PersonDTO;
import br.com.attornatus.api.services.PersonService;
import br.com.attornatus.api.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Recurso controller pessoa
 * @author ed
 *
 */

@RestController
@RequestMapping(value = "/pessoa")
public class PersonResource {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private PersonService service;
    @GetMapping(value = "/{id}")
    public ResponseEntity<PersonDTO> findById(@PathVariable Long id) throws ObjectNotFoundException {
        return ResponseEntity.ok().body(mapper.map(service.findById(id), PersonDTO.class));
    }
    @GetMapping
    public ResponseEntity<List<PersonDTO>> findByAll() {
        return ResponseEntity.ok().body(service.findAll().stream().map(personMap -> mapper.map(personMap, PersonDTO.class))
                .collect(Collectors.toList()));

    }
}
