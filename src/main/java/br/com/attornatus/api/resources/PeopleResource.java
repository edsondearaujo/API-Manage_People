package br.com.attornatus.api.resources;

import br.com.attornatus.api.domain.People;
import br.com.attornatus.api.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoa")
public class PeopleResource {

    @Autowired
    private PeopleService service;
    @GetMapping(value = "/{id}")
    public ResponseEntity<People> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findById(id));
    }
}
