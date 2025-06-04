package com.javanauta.bffagendador.bussines.dto.in;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.javanauta.bffagendador.bussines.enums.StatusNotificacaoEnum;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TarefasDTORequest {
    //Utilizado sempre os que estão dentro da requisição/parametro

    // Normalmente na Controller;
    // @PostMapping
    //    TarefasDTOResponse gravarTarefas(@RequestBody **TarefasDTORequest** dto,
    //                                     @RequestHeader("Authorization") String token);

    private String nomeTarefa;
    private String descricao;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime dataEvento;
}
