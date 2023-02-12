package br.com.attornatus.api.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Model
 * Classe de domínio endereço
 * @author ed
 *
 */

@Entity
@Data
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "enderecos")

public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id = 0L;

    private String logradouro = "";
    private String cep = "";
    private Long numero = 0L;
    private String cidade = "";

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @ManyToOne(cascade = CascadeType.ALL)
    private Person pessoa;

}
