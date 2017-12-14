package enigma;

import services.EnigmaService;
import java.util.Scanner;

public class Caesar implements EnigmaService {

	public static final boolean KEY_REQUIRED = true;
	public static final String name = "Caesar";

    private String name;
    private String key;


    public String encipher(String text) {
		int shift = Integer.parseInt(this.key);
        String caesar_text = "";
        int len = text.length();

        for(int x = 0; x < len; x++) {
            char c = (char)(text.charAt(x) + shift);
            if (c > 'z')
                caesar_text += (char)(text.charAt(x) - (26-shift));
            else
                caesar_text += (char)(text.charAt(x) + shift);
        }
        return caesar_text;
	}

    public String decipher(String text) {
        String caesar_text = "";
        int len = text.length();
        int shift = Integer.parseInt(this.key);
        shift = shift * -1;


        for(int x = 0; x < len; x++) {
            char c = (char)(text.charAt(x) + shift);
            if (c > 'z')
                caesar_text += (char)(text.charAt(x) - (26+shift));
            else
                caesar_text += (char)(text.charAt(x) + shift);
        }
        return caesar_text;
    }

    public String getName() {
		return this.name;
	}

    public boolean isKeyRequired() {
		return KEY_REQUIRED;
	}

    public void setKey(String key) {

        if (isKeyOnlyNumbers(key)){
            this.key = key;
        }
        else{
            System.out.println("Key must be only numbers!");
            System.exit(0);
        }
    }
    private Boolean isKeyOnlyNumbers(String key){
        char[] chars = key.toCharArray();

        for (char c : chars) {
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    }
