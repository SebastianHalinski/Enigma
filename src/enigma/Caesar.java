package enigma;

import services.EnigmaService;
import java.util.Scanner;

public class Caesar implements EnigmaService {

	public static final boolean KEY_REQUIRED = true;
    private String name;
    private String key;

    public Caesar(String name) {
		this.name = name;
	}

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
        this.key = key;
    }


}
