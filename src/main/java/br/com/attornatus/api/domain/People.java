package br.com.attornatus.api.domain;
//Modelos

import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pessoas")
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 0L;
    private String nome = "";
    private String dataNascimento = "";
    //@OneToMany(cascade=CascadeType.PERSIST, mappedBy="people")
    //private List<Address> endereco = new ArrayList<>();


}
