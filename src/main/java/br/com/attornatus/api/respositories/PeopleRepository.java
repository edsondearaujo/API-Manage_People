package br.com.attornatus.api.respositories;
//Comunicação com o Banco de Dados

import br.com.attornatus.api.domain.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<People, Long> {
}
