package br.com.attornatus.api.services.impl;
//Implementação (impl)

import br.com.attornatus.api.domain.People;
import br.com.attornatus.api.respositories.PeopleRepository;
import br.com.attornatus.api.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleRepository repository;
    @Override
    public People findById(Long id) {
        Optional<People> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
