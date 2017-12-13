package enigma;

import services.EnigmaService;

public class SimpleSubstitution implements EnigmaService {

	public static final boolean KEY_REQUIRED = true;
	private String name;

	public SimpleSubstitution(String name){
		this.name = name;
	}

    public String encipher(String text){
        return text;
    }

    public String decipher(String text){
        return text;
    }

    public String getName(){
        return this.name;
    }

    public boolean isKeyRequired(){
        return KEY_REQUIRED;
    }

    public void setKey(String key) {}
}
