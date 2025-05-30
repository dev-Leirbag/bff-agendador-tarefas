package com.javanauta.bffagendador.infrastructure.client;

import com.javanauta.bffagendador.bussines.dto.in.EnderecoDTORequest;
import com.javanauta.bffagendador.bussines.dto.in.LoginDTORequest;
import com.javanauta.bffagendador.bussines.dto.in.TelefoneDTORequest;
import com.javanauta.bffagendador.bussines.dto.in.UsuarioDTORequest;
import com.javanauta.bffagendador.bussines.dto.out.EnderecoDTOResponse;
import com.javanauta.bffagendador.bussines.dto.out.TelefoneDTOResponse;
import com.javanauta.bffagendador.bussines.dto.out.UsuarioDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

//Se comporta como se fosse um Postman, onde ele faz a requisição no endpoint busca usuario por email
// passando email e token.

@FeignClient(name = "usuario", url = "${usuario.url}")
public interface UsuarioClient {

    @PostMapping
        //Metodo que salva o usuario, nao possui token
    UsuarioDTOResponse salvaUsuario(@RequestBody UsuarioDTORequest usuarioDTO);

    @PostMapping("/login")
    String login(@RequestBody LoginDTORequest usuarioDTO);

    @GetMapping
    UsuarioDTOResponse buscaUsuarioPorEmail(@RequestParam("email") String email,
                                           @RequestHeader("Authorization") String token);

    @DeleteMapping("/{email}")
    void deletaUsuarioPorEmail(@PathVariable String email,
                               @RequestHeader("Authorization") String token);

    @PutMapping
    UsuarioDTOResponse atualizaDadosUsuario(@RequestBody UsuarioDTORequest dto,
                                           @RequestHeader("Authorization") String token);

    @PutMapping("/endereco")
    EnderecoDTOResponse atualizaEndereco(@RequestBody EnderecoDTORequest dto,
                                         @RequestParam("id") Long id,
                                         @RequestHeader("Authorization") String token);

    @PutMapping("/telefone")
    TelefoneDTOResponse atualizaTelefone(@RequestBody TelefoneDTORequest dto,
                                         @RequestParam("id") Long id,
                                         @RequestHeader("Authorization") String token);

    @PostMapping("/endereco")
    EnderecoDTOResponse cadastraEndereco(@RequestBody EnderecoDTORequest dto,
                                        @RequestHeader("Authorization") String token);

    @PostMapping("/telefone")
    TelefoneDTOResponse cadastraTelefone(@RequestBody TelefoneDTORequest dto,
                                        @RequestHeader("Authorization") String token);
}
