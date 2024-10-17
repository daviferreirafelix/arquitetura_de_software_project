package br.ifg.urutai.usercases;

import br.ifg.urutai.entity.User;
import br.ifg.urutai.usercase.port.IdGenerator;
import br.ifg.urutai.usercase.port.PasswordEncoder;
import br.ifg.urutai.usercase.port.UserRepository;
import br.ifg.urutai.usercase.validator.UserValidator;

public class CreateUser {
	
	private UserRepository repository;
	private IdGenerator generator;
	private PasswordEncoder encoder;
	
	
	public CreateUser(final UserRepository repository, 
			final IdGenerator generator, final PasswordEncoder encoder) {
		super();
		this.repository = repository;
		this.generator = generator;
		this.encoder = encoder;
	}



	public User create(final User user) throws Exception {
		UserValidator.validateCreateUser(user);
		if (repository.findByEmail(user.getEmail()).isPresent()){
			throw new RuntimeException(user.getEmail());
		}
		
		User userToSave = User.builder()
				.id(generator.generate())
				.email(user.getEmail())
				.password(encoder.encode(user.getEmail() + user.getPassword()))
				.lastName(user.getLastName())
				.firstName(user.getFirstName())
				.build();
		
		return repository.create(userToSave);
	}
}
