package br.ifg.urutai.usercases;

import java.util.List;
import java.util.Optional;

import br.ifg.urutai.entity.User;
import br.ifg.urutai.usercase.port.UserRepository;

public class FindUser {
	
	private UserRepository userRepository;
	
	
	public FindUser(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	
	public Optional<User> findById(String id) {
		return this.userRepository.findByEmail(id);
	}
	
	public List<User> findAll(){
		return this.userRepository.findAll();
	}
}
