package com.mario.backend.user.controller;

import javax.annotation.PostConstruct;

import com.mario.backend.user.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
public class UserController {
	
	@GetMapping("/")
	public String getMensagem() {
		return "Spring boot is working!";
	}

	@GetMapping("/users")
	public List<UserDTO> getUsers() {
		return usuarios;
	}

	@GetMapping("/users/{cpf}")
	public UserDTO getUsersByCpf(@PathVariable String cpf) {
		for (UserDTO userFilter: usuarios) {
			if (userFilter.getCpf().equals(cpf)) {
				return userFilter;
			}
		}
		return null;
	}

	@PostMapping("/newUser")
	UserDTO insertUser(@RequestBody UserDTO userDTO) {
		userDTO.setDataCadastro(new Date());
		usuarios.add(userDTO);
		return userDTO;
	}

	@DeleteMapping("/users/{cpf}")
	public boolean removerUserByCpf(@PathVariable String cpf) {
		for (UserDTO userFilter: usuarios) {
			if (userFilter.getCpf().equals(cpf)) {
				usuarios.remove(userFilter);
				return true;
			}
		}
		return false;
	}
	
	public static List<UserDTO> usuarios = new ArrayList<UserDTO>();
	
	@PostConstruct //faz com que o método initiateList() seja executado logo depois que o contêiner inicializa a classe UserController
	public void initiateList() {
		UserDTO userDTO = new UserDTO();
		userDTO.setNome("Eduardo");
		userDTO.setCpf("123");
		userDTO.setEndereco("Rua a");
		userDTO.setEmail("eduardo@email.com");
		userDTO.setTelefone("1234-3454");
		userDTO.setDataCadastro(new Date());
		
		UserDTO userDTO2 = new UserDTO();
		userDTO2.setNome("Luiz");
		userDTO2.setCpf("456");
		userDTO2.setEndereco("Rua b");
		userDTO2.setEmail("luiz@email.com");
		userDTO2.setTelefone("1234-3454");
		userDTO2.setDataCadastro(new Date());
		
		UserDTO userDTO3 = new UserDTO();
		userDTO3.setNome("Bruna");
		userDTO3.setCpf("789");
		userDTO3.setEndereco("Rua c");
		userDTO3.setEmail("bruna@email.com");
		userDTO3.setTelefone("1234-3454");
		userDTO3.setDataCadastro(new Date());
		
		usuarios.add(userDTO);
		usuarios.add(userDTO2);
		usuarios.add(userDTO3);
	}
}
