package enigma;

import services.EnigmaService;

public class ROT13 implements EnigmaService {

	public static final boolean KEY_REQUIRED = false;
	private String name;

	public ROT13(String name){
		this.name = name;
	}

	public String encipher(String text){

		char[] values = text.toCharArray();

        for (int index = 0; index < values.length; index++) {
            char letter = values[index];
            if (letter >= 'a' && letter <= 'z') {
                if (letter > 'm') {
                    letter -= 13;
                } else {
                    letter += 13;
                }
            } else if (letter >= 'A' && letter <= 'Z') {
                if (letter > 'M') {
                    letter -= 13;
                } else {
                    letter += 13;
                }
            }
            values[index] = letter;
        }
        return new String(values);
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
