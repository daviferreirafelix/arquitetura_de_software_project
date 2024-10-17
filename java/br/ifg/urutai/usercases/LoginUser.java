package br.ifg.urutai.usercases;

import br.ifg.urutai.entity.User;
import br.ifg.urutai.usercase.port.PasswordEncoder;
import br.ifg.urutai.usercase.port.UserRepository;

public class LoginUser {
	
	private UserRepository userRepository;
	private PasswordEncoder passwordEncoder;
	
	
	public LoginUser(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		super();
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}
	

	public User login(final String email, final String password) {
		User user = userRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("Not Allowed"));
		String hashedPassword = passwordEncoder.encode(email + password);
		
		if(!user.getPassword().equals(hashedPassword)) throw new RuntimeException("Not Allowed");
		return user;
	}

}
