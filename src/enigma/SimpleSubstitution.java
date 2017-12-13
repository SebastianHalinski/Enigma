package enigma;

import services.EnigmaService;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

public class SimpleSubstitution implements EnigmaService {

	public static final boolean KEY_REQUIRED = true;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz ";
	private String name;
    private String key;
    private Scanner reader;

	public SimpleSubstitution(String name){
		this.name = name;
	}

    public String encipher(String text){
        getKeyFromUser();
        String cipherAlphabet = generateCipherAlphabet(this.key);
        String encoded = new String();

        for(int i=0; i<text.length(); i++){
            char temp = text.charAt(i);
            int tempNums = new String(alphabet).indexOf(temp);
            encoded += new String(cipherAlphabet).charAt(tempNums);
        }
        return encoded;
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
        this.key = key;
    }

    private void getKeyFromUser(){
        reader = new Scanner(System.in);
        if (isKeyRequired()){
            System.out.println("Enter key: ");
            String key = reader.nextLine();
            setKey(key);
        }
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
