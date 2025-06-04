package com.javanauta.bffagendador.bussines.dto.in;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnderecoDTORequest {
    //Utilizado sempre os que estão dentro da requisição/parametro

    // Normalmente na Controller;
    // @PostMapping
    //    TarefasDTOResponse gravarTarefas(@RequestBody **TarefasDTORequest** dto,
    //                                     @RequestHeader("Authorization") String token);

    private String rua;
    private Long numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;

}
