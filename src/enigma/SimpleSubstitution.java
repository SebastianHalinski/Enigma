package enigma;

import services.EnigmaService;

public class SimpleSubstitution implements EnigmaService {

	public static final boolean KEY_REQUIRED = true;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz ";
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

    public void setKey(String key) {
        System.out.println(key);
    }

    private String generateCipherAlphabet(String key){
        key = key.toLowerCase();
        Set<Character> uniqueCharacters = new LinkedHashSet<>();
        for (int i = 0; i < key.length(); i++){
            uniqueCharacters.add(key.charAt(i));
        }
        for (int i = 0; i < alphabet.length(); i++){
            uniqueCharacters.add(alphabet.charAt(i));
        }
        String cipherAlphabet = new String();

        for (Character element : uniqueCharacters){
            cipherAlphabet += element;
        }
        return cipherAlphabet;

    }
}
