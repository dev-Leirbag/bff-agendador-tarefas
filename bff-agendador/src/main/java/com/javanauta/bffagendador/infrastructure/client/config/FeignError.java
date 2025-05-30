package com.javanauta.bffagendador.infrastructure.client.config;

import com.javanauta.bffagendador.infrastructure.exceptions.BussinesException;
import com.javanauta.bffagendador.infrastructure.exceptions.ConflictException;
import com.javanauta.bffagendador.infrastructure.exceptions.ResourceNotFoundException;
import com.javanauta.bffagendador.infrastructure.exceptions.UnauthorizedException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignError implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        switch (response.status()) {
            case 409:
                return new ConflictException("Erro atributo já existente ");
            case 403:
                return new ResourceNotFoundException("Erro atributo não encontrado ");
            case 401:
                return new UnauthorizedException("Erro usuário não autorizado");
            default:
                return new BussinesException("Erro de servidor");
        }
    }
}
