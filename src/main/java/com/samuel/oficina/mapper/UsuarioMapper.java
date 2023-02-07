package com.samuel.oficina.mapper;

import com.samuel.oficina.domain.Usuario;
import com.samuel.oficina.request.UsuarioRequest;
import com.samuel.oficina.response.UsuarioResponse;

public class UsuarioMapper {
	public static Usuario toUsuario(UsuarioRequest usuarioRequest) {
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(usuarioRequest.getIdUsuario());
		usuario.setNome(usuarioRequest.getNome());
		usuario.setEmail(usuarioRequest.getEmail());
		usuario.setIdcargo(usuarioRequest.getIdcargo());
		usuario.setSenha(usuarioRequest.getSenha());
		return usuario;
	}
	
	public static UsuarioResponse toUsuarioResponse(Usuario usuario) {
		UsuarioResponse response = new UsuarioResponse();
		response.setNome(usuario.getNome());
		response.setEmail(usuario.getEmail());
		response.setIdUsuario(usuario.getIdUsuario());
		response.setIdcargo(usuario.getIdcargo());
		return response;
	}
}
