package br.com.attornatus.api.domain;

import jakarta.persistence.*;
import lombok.*;
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
}
