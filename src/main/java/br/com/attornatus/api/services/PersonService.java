package br.com.attornatus.api.services;

import br.com.attornatus.api.domain.Person;
import br.com.attornatus.api.services.exceptions.ObjectNotFoundException;


/**
 * Camada Lógica
 * @author ed
 *
 */
public interface PersonService {
    Person findById(Long id) throws ObjectNotFoundException;
}
