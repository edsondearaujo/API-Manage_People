package br.com.attornatus.api.services.impl;
//Implementação (impl): Métodos

import br.com.attornatus.api.domain.Person;
import br.com.attornatus.api.respositories.PersonRepository;
import br.com.attornatus.api.services.PersonService;
import br.com.attornatus.api.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;


/**
 * Implementação da lógica de negócio
 * @author ed
 *
 */

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository repository;

    @Override
    public Person findById(Long id) throws ObjectNotFoundException {
        Optional<Person> idPessoa = repository.findById(id);
        return idPessoa.orElseThrow(()-> new ObjectNotFoundException("Pessoa não encontrada pelo id -> " + id)) ;
    }
}
