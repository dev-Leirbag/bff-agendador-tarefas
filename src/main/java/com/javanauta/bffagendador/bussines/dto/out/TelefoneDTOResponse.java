package com.javanauta.bffagendador.bussines.dto.out;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefoneDTOResponse {
    //Utilizamos aonde tem resposta
    //Normalmente na Client;
    //  @PostMapping
    //  TarefasDTOResponse gravarTarefas(@RequestBody TarefasDTORequest dto,
    //  @RequestHeader("Authorization") String token);

    private Long id;
    private String numero;
    private String ddd;

}
