package br.ifg.urutai.usercase.validator;

import br.ifg.urutai.entity.User;
// import br.ifg.urutai.usercase.exception.UserValidationException;

public class UserValidator {
	public static void validateCreateUser(final User user) { // posteriormente, lançar a exceção correta
		if (user == null) throw new RuntimeException("it's null");
		if (user.getEmail() == null) throw new RuntimeException("it's null");
		if (user.getFirstName() == null) throw new RuntimeException("it's null");
		if (user.getLastName() == null) throw new RuntimeException("it's null");
	}
}
