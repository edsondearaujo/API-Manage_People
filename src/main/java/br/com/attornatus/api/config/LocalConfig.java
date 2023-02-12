package br.com.attornatus.api.config;

import br.com.attornatus.api.domain.Address;
import br.com.attornatus.api.domain.Person;
import br.com.attornatus.api.respositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

/**
 * Configuração local do Banco de Dados
 * @author ed
 *
 */
@Configuration
@Profile("local")
public class LocalConfig {


    @Autowired
    private PersonRepository repository;

    @Bean
    public void startDB() {

        //Address end1 = new Address(1L, "Jardim", "123.654-58", 51L, "Monte rio");
        //Address end2 = new Address(2L, "Vilareijo", "258.897-14", 33L, "Jalapião");


        Person p1 = new Person(1L, "Mar", "21/04/1996");
        Person p2 = new Person(2L, "Sol", "13/11/1990");



        repository.saveAll(List.of(p1, p2));

    }

}
