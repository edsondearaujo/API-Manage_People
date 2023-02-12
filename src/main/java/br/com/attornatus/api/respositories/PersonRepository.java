package br.com.attornatus.api.respositories;

/***
 * Camada de acesso ao Banco de Dados
 * @author ed
 *
 */

import br.com.attornatus.api.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
