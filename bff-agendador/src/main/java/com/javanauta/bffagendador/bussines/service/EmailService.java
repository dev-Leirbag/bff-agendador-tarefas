package com.javanauta.bffagendador.bussines.service;

import com.javanauta.bffagendador.bussines.dto.out.TarefasDTOResponse;
import com.javanauta.bffagendador.bussines.dto.out.TelefoneDTOResponse;
import com.javanauta.bffagendador.infrastructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final EmailClient client;

    public void enviaEmail(TarefasDTOResponse dto) {
         client.enviarEmail(dto);
    }
}
