package com.javanauta.bffagendador.bussines.dto.in;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTORequest {
    //Utilizado sempre os que estão dentro da requisição/parametro

    // Normalmente na Controller;
    // @PostMapping
    //    TarefasDTOResponse gravarTarefas(@RequestBody **TarefasDTORequest** dto,
    //                                     @RequestHeader("Authorization") String token);

    private String nome;
    private String email;
    private String senha;
    private List<EnderecoDTORequest> enderecos;
    private List<TelefoneDTORequest> telefones;
}
