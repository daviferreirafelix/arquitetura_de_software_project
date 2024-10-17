package br.ifg.urutai.config;

import br.ifg.urutai.adapter.encoder.Sha256PasswordEncoder;
import br.ifg.urutai.adapter.idgenerator.UuidGenerator;
import br.ifg.urutai.adapter.repository.InMemoryUserRepository;
import br.ifg.urutai.usercase.port.IdGenerator;
import br.ifg.urutai.usercase.port.PasswordEncoder;
import br.ifg.urutai.usercase.port.UserRepository;
import br.ifg.urutai.usercases.CreateUser;
import br.ifg.urutai.usercases.FindUser;
import br.ifg.urutai.usercases.LoginUser;

public class ManualConfig {

	private final UserRepository userRepository = new InMemoryUserRepository();
	private final IdGenerator idGenerator = new UuidGenerator();
	private final PasswordEncoder passwordEncoder = new Sha256PasswordEncoder();
	
	
	public CreateUser createUser() {
		return new CreateUser(userRepository, idGenerator, passwordEncoder);
	}
	
	public FindUser findUser() {
		return new FindUser(userRepository);
	}
	
	public LoginUser loginUser() {
		return new LoginUser(userRepository, passwordEncoder);
	}
}
