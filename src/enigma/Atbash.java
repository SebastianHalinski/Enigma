package enigma;

import services.EnigmaService;

public class Atbash implements EnigmaService {

	public static final boolean KEY_REQUIRED = false;
	private String name;

	public Atbash(String name){
		this.name = name;
	}
