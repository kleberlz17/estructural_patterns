package br.com.cod3r.adapter.hexagonal.application;

import java.util.List;
import java.util.Map;

import br.com.cod3r.adapter.hexagonal.core.usecases.UserService;
import br.com.cod3r.adapter.hexagonal.core.model.User;
import br.com.cod3r.adapter.hexagonal.core.ports.UserRepository;
import br.com.cod3r.adapter.hexagonal.infrastructure.UserMemoryDatabaseAdapter;

public class UserRest {
	private UserService userService;
	
	public UserRest() {
		UserRepository userRepository = new UserMemoryDatabaseAdapter();
		userService = new UserService(userRepository);
	}

	public Integer post(Map<String, String> values) {
		try {
			User user = new User(values.get("name"), values.get("email"), values.get("password"));
			userService.saveUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 400;
		}
		return 201;
	}
	
	public Integer get() {
		List<User> users = userService.getUsers();
		users.stream().forEach(System.out::println);
		return 200;
	}
}
