package com.mario.backend.user.dto;

import java.util.Date;

import lombok.Data;

@Data // gera os gets e sets da classe
public class UserDTO {
	
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	private String telefone;
	private Date dataCadastro;
	
	//gets e sets
}
