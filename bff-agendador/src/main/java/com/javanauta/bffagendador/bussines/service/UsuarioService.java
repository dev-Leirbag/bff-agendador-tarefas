package com.javanauta.bffagendador.bussines.service;


import com.javanauta.bffagendador.bussines.dto.in.EnderecoDTORequest;
import com.javanauta.bffagendador.bussines.dto.in.LoginDTORequest;
import com.javanauta.bffagendador.bussines.dto.in.TelefoneDTORequest;
import com.javanauta.bffagendador.bussines.dto.in.UsuarioDTORequest;
import com.javanauta.bffagendador.bussines.dto.out.EnderecoDTOResponse;
import com.javanauta.bffagendador.bussines.dto.out.TelefoneDTOResponse;
import com.javanauta.bffagendador.bussines.dto.out.UsuarioDTOResponse;
import com.javanauta.bffagendador.bussines.dto.out.ViaCepDTOResponse;
import com.javanauta.bffagendador.infrastructure.client.UsuarioClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioClient client;

    public UsuarioDTOResponse salvaUsuario(UsuarioDTORequest usuarioDTO) {
        return client.salvaUsuario(usuarioDTO);
    }

    public String loginUsuario(LoginDTORequest usuarioDTO){
        return client.login(usuarioDTO);
    }

    public UsuarioDTOResponse buscarUsuarioPorEmail(String email, String token) {
       return client.buscaUsuarioPorEmail(email, token);
    }

    public void deletaUsuarioPorEmaiil(String email, String token) {
         client.deletaUsuarioPorEmail(email, token);
    }

    public UsuarioDTOResponse atualizaDadosUsuario(String token, UsuarioDTORequest dto){
     return client.atualizaDadosUsuario(dto, token);
    }

    public EnderecoDTOResponse atualizaEndereco(Long idEndereco, EnderecoDTORequest enderecoDTO, String token){
        return client.atualizaEndereco(enderecoDTO, idEndereco, token);
    }

    public TelefoneDTOResponse atualizaTelefone(Long idTelefone, TelefoneDTORequest telefoneDTO, String token){
        return client.atualizaTelefone(telefoneDTO, idTelefone, token);
    }

    public EnderecoDTOResponse cadastraEndereco(String token, EnderecoDTORequest dto){
        return client.cadastraEndereco(dto, token);
    }

    public TelefoneDTOResponse cadastraTelefone(String token, TelefoneDTORequest dto){
        return client.cadastraTelefone(dto, token);
    }

    public ViaCepDTOResponse buscarEnderecoPorCep(String cep){
        return client.buscarDadosCep(cep);
    }

}
