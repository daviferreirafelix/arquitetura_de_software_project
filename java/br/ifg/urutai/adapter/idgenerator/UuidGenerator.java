package br.ifg.urutai.adapter.idgenerator;

import java.util.UUID;

import br.ifg.urutai.usercase.port.IdGenerator;

public class UuidGenerator implements IdGenerator{

	@Override
	public String generate() {
		return UUID.randomUUID().toString();
	}

}