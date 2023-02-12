package br.com.attornatus.api.services.exceptions;

/**
 * Mensagem de objeto não encontrado
 * @author ed
 *
 */
public class ObjectNotFoundException extends Exception{

    public ObjectNotFoundException(String message){
        super(message);
    }
}
