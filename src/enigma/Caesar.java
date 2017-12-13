package enigma;

import services.EnigmaService;
import java.util.Scanner;

public class Caesar implements EnigmaService {

	public static final boolean KEY_REQUIRED = false;
    private String name;
    private Scanner userInput = new Scanner(System.in);

    public Caesar(String name)
    {
		this.name = name;
	}

    public String encipher(String text)
    {
		int shift;
        String s = "";
        int len = text.length();
        for(int x = 0; x < len; x++){
            char c = (char)(text.charAt(x) + shift);
            if (c > 'z')
                s += (char)(text.charAt(x) - (26-shift));
            else
                s += (char)(text.charAt(x) + shift);
        }
        return s;
	}

    public String decipher(String text)
    {
	return "dec("+text+")";
    }

    public String getName()
    {
		return this.name;
	}

    public boolean isKeyRequired()
    {
		return KEY_REQUIRED;
	}

    public void setKey(String key) 
    {

    }


}
