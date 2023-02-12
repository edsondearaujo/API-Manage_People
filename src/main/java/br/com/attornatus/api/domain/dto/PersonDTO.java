package br.com.attornatus.api.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO
 * Camada de Transeferência de Dados de forma segura
 * @author ed
 *
 */

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    @JsonIgnore
    private Long id = 0L;
    private String nome = "";
    private String dataNascimento = "";
}
