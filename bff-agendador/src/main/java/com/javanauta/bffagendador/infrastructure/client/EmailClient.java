package com.javanauta.bffagendador.infrastructure.client;

import com.javanauta.bffagendador.bussines.dto.out.TarefasDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//Se comporta como se fosse um Postman, onde ele faz a requisição no endpoint busca usuario por email
// passando email e token.

@FeignClient(name = "notificacao", url = "${notificacao.url}")
public interface EmailClient {

    @PostMapping
    void enviarEmail(@RequestBody TarefasDTOResponse dto);
}
