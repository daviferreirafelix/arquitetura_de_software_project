package br.ifg.urutai.application;

import br.ifg.urutai.config.ManualConfig;
import br.ifg.urutai.entity.User;
import br.ifg.urutai.usercases.CreateUser;
import br.ifg.urutai.usercases.FindUser;
import br.ifg.urutai.usercases.LoginUser;

public class Main {
	public static void main(String[] args) {
		ManualConfig config = new ManualConfig();
		CreateUser createUser = config.createUser();
		FindUser findUser = config.findUser();
		LoginUser loginuser = config.loginUser();
		User user = User.builder()
				.email("abc@email.com")
				.password("password")
				.lastName("Silva")
				.firstName("Jose")
				.build();
	}
}
