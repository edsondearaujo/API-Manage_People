package br.com.attornatus.api.services;

import br.com.attornatus.api.domain.People;

//Camada Lógica
public interface PeopleService {
    People findById(Long id);
}
