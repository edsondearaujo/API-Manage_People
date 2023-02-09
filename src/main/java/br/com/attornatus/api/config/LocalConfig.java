package br.com.attornatus.api.config;

import br.com.attornatus.api.domain.People;
import br.com.attornatus.api.respositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private PeopleRepository repository;
    @Bean
    public void startDB() {
        People p1 = new People(2L, "Mar", "21/04/1996");
        People p2 = new People(3L, "Sol", "13/11/1990");

        repository.saveAll(List.of(p1, p2));

    }
}
