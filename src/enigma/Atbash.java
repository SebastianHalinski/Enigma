package enigma;

import services.EnigmaService;

public class Atbash implements EnigmaService {

	public static final boolean KEY_REQUIRED = false;
	public static final String name = "Atbash";

	public static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  public static final String encoder = "ZYXWVUTSRQPONMLKJIHGFEDCBAzyxwvutsrqponmlkjihgfedcba";


    public String encipher(String text){
        char[] values = text.toUpperCase().toCharArray();
		for(char c : values){
			if(!Character.isLetter(c)){
				return "Wrong input";
			}
		}
        String encripted_word = "";
        for (int index = 0; index < values.length; index++) {
            char letter = values[index];
            int index_letter_encript = letters.indexOf(letter);
            encripted_word += encoder.charAt(index_letter_encript);
        }
        return new String(encripted_word);
    }


    public String decipher(String text){
        char[] values = text.toUpperCase().toCharArray();
		for(char c : values){
			if(!Character.isLetter(c)){
				return "Wrong input";
			}
		}
        String encripted_word = "";
        for (int index = 0; index < values.length; index++) {
            char letter = values[index];
            int index_letter_encript = letters.indexOf(letter);
            encripted_word += encoder.charAt(index_letter_encript);
        }
        return new String(encripted_word);
    }

    public String getName(){
        return this.name;
    }

    public boolean isKeyRequired(){
        return KEY_REQUIRED;
    }

    public void setKey(String key) {}


    }
