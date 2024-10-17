package br.ifg.urutai.adapter.encoder;

import org.apache.commons.codec.digest.DigestUtils;
import br.ifg.urutai.usercase.port.PasswordEncoder;

public class Sha256PasswordEncoder implements PasswordEncoder{

	@Override
	public String encode(String encode) {
		return DigestUtils.sha256Hex(encode);
	}
}
