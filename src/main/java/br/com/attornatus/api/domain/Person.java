package br.com.attornatus.api.domain;
//Modelos

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Model
 * Classe de domínio pessoa
 * @author ed
 *
 */

@Entity
@Data
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pessoas_tbl")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 0L;
    private String nome = "";
    private String dataNascimento = "";

}
