package br.com.attornatus.api.services;

import br.com.attornatus.api.domain.Person;
import br.com.attornatus.api.domain.dto.PersonDTO;
import br.com.attornatus.api.services.exceptions.ObjectNotFoundException;

import java.util.List;


/**
 * Camada Lógica
 * @author ed
 *
 */
public interface PersonService {
    Person findById(Long id) throws ObjectNotFoundException;
    List<Person> findAll();

    Person create(PersonDTO pessoa);
}
