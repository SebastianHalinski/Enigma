package enigma;

import services.EnigmaService;

public class Atbash implements EnigmaService {

	public static final boolean KEY_REQUIRED = false;
	private String name;

	public Atbash(String name){
		this.name = name;
	}

    public String encipher(String text){
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String encoder = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        char[] values = text.toUpperCase().toCharArray();
        String encripted_word = "";
        for (int index = 0; index < values.length; index++) {
            char letter = values[index];
            int index_letter_encript = letters.indexOf(letter);
            encripted_word += encoder.charAt(index_letter_encript);
        }
        return new String(encripted_word);
    }


    public String decipher(String text){
    return "dec("+text+")";
    }

    public String getName(){
        return this.name;
    }

    public boolean isKeyRequired(){
        return KEY_REQUIRED;
    }

    public void setKey(String key) {}


    }
