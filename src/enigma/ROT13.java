package enigma;

import services.EnigmaService;

public class ROT13 implements EnigmaService {

	public static final boolean KEY_REQUIRED = false;
	private String name;

	public ROT13(String name){
		this.name = name;
	}



}
