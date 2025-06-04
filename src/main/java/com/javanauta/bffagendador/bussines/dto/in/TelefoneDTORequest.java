package com.javanauta.bffagendador.bussines.dto.in;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefoneDTORequest {
    //Utilizado sempre os que estão dentro da requisição/parametro

    // Normalmente na Controller;
    // @PostMapping
    //    TarefasDTOResponse gravarTarefas(@RequestBody **TarefasDTORequest** dto,
    //                                     @RequestHeader("Authorization") String token);

    private String numero;
    private String ddd;

}
