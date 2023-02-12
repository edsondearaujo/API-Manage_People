package br.com.attornatus.api.resources.exceptions;


import br.com.attornatus.api.services.exceptions.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

/**
 * Recurso de tratamento de exceção de erro
 * @author ed
 *
 */

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandarError>objectNotFound(ObjectNotFoundException ex, HttpServletRequest request) {
        StandarError error =
                new StandarError(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(),
                        ex.getMessage(), request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
