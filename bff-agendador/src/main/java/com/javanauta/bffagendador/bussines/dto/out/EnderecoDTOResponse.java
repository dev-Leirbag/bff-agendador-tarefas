package com.javanauta.bffagendador.bussines.dto.out;

import com.javanauta.bffagendador.bussines.dto.in.TarefasDTORequest;
import lombok.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnderecoDTOResponse {
    //Utilizamos aonde tem resposta
    //Normalmente na Client;
    //  @PostMapping
    //  TarefasDTOResponse gravarTarefas(@RequestBody TarefasDTORequest dto,
    //  @RequestHeader("Authorization") String token);
    private Long id;
    private String rua;
    private Long numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;

}
