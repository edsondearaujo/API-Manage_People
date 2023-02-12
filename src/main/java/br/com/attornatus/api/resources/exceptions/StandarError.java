package br.com.attornatus.api.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Erro padrão
 * @author ed
 *
 */

@Getter @Setter
@AllArgsConstructor
public class StandarError {

    private LocalDateTime timestamp;
    private Integer status;
    private String error;
    private String path;
}
