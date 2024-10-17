package br.ifg.urutai.usercase.port;

import java.util.List;
import java.util.Optional;

import br.ifg.urutai.entity.User;

public interface UserRepository {
	
	Optional<User> findByEmail(String email);
	
	List<User> findAll();
	
	Optional<User> findById(String id);
	
	User create(User user);
}
