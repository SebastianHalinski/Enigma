package enigma;

import services.EnigmaService;

public class SimpleSubstitution implements EnigmaService {

	public static final boolean KEY_REQUIRED = true;
	private String name;

	public SimpleSubstitution(String name){
		this.name = name;
	}

}
