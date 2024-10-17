package br.ifg.urutai.adapter.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import br.ifg.urutai.entity.User;
import br.ifg.urutai.usercase.port.UserRepository;

public class InMemoryUserRepository implements UserRepository{

	private final Map<String, User> inMemoryDB = new HashMap<>();

	@Override
	public Optional<User> findByEmail(final String email) {
		return inMemoryDB.values().stream()
				.filter(user -> user.getEmail().equals(email))
				.findAny();
	}

	@Override
	public List<User> findAll() {
		return new ArrayList<>(inMemoryDB.values());
	}

	@Override
	public Optional<User> findById(final String id) {
		return Optional.ofNullable(inMemoryDB.get(id));
	}

	@Override
	public User create(User user) {
		this.inMemoryDB.put(user.getId(), user);
		return user;
	}
}
