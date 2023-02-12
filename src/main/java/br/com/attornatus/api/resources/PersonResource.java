package br.com.attornatus.api.resources;

import br.com.attornatus.api.domain.Address;
import br.com.attornatus.api.domain.Person;
import br.com.attornatus.api.domain.dto.PersonDTO;
import br.com.attornatus.api.services.PersonService;
import br.com.attornatus.api.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
        return ResponseEntity.ok().body(service.findAll()
                .stream().map(pessoaMap -> mapper.map(pessoaMap, PersonDTO.class)).collect(Collectors.toList()));
    }

    @PostMapping
    public ResponseEntity<PersonDTO> create(@RequestBody PersonDTO pessoa) {
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequestUri().path("/{id}").buildAndExpand(service.create(pessoa).getId()).toUri();
        return ResponseEntity.created(uri).build();

    }
}
