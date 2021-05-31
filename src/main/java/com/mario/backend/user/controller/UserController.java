package com.mario.backend.user.controller;

import javax.annotation.PostConstruct;

import com.mario.backend.user.dto.UserDTO;
import com.mario.backend.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<UserDTO> getUsers() {
		List<UserDTO> usuarios = userService.getAll();
		return usuarios;
	}

	@GetMapping("/user/{id}")
	UserDTO findById(@PathVariable Long id) {
		return userService.findById(id);
	}

	@GetMapping("/user/cpf/{cpf}")
	UserDTO findByCpf(@PathVariable String cpf) {
		return userService.findByCpf(cpf);
	}

	@GetMapping("/user/search")
	public List<UserDTO> queryByName(
			@RequestParam(name="nome", required = true)
					String nome) {
		return userService.queryByName(nome);
	}

	@PostMapping("/user")
	UserDTO newUser(@RequestBody UserDTO userDTO) {
		return userService.save(userDTO);
	}

	@DeleteMapping("/user/{id}")
//	UserDTO delete(@PathVariable Long id) throws UserNotFoundException {
	UserDTO delete(@PathVariable Long id) {
		return userService.delete(id);
	}

}
