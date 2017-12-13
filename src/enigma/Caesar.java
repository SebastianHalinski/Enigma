package enigma;

import services.EnigmaService;

public class Caesar implements EnigmaService {

	public static final boolean KEY_REQUIRED = false;
	private String name;

    public Caesar(String name)
    {
		this.name = name;
	}

    public String encipher(String text)
    {
		return "enc("+text+")";
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
