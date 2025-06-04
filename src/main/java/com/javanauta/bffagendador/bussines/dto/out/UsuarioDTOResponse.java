package com.javanauta.bffagendador.bussines.dto.out;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTOResponse {
    //Utilizamos aonde tem resposta
    //Normalmente na Client;
    //  @PostMapping
    //  TarefasDTOResponse gravarTarefas(@RequestBody TarefasDTORequest dto,
    //  @RequestHeader("Authorization") String token);

    private String nome;
    private String email;
    private String senha;
    private List<EnderecoDTOResponse> enderecos;
    private List<TelefoneDTOResponse> telefones;
}
