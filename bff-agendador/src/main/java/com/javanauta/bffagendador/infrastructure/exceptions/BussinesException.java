package com.javanauta.bffagendador.infrastructure.exceptions;

public class BussinesException extends RuntimeException {

    public BussinesException(String mensagem){
        super(mensagem);
    }

    public BussinesException(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
