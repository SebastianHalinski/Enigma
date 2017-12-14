package enigma;

import services.EnigmaService;
import java.util.Set;
import java.util.LinkedHashSet;

public class SimpleSubstitution implements EnigmaService {

	public static final boolean KEY_REQUIRED = true;
	public static final String name = "SimpleSubstitution";
  private String alphabet = "abcdefghijklmnopqrstuvwxyz ";
  private String key;

    public String encipher(String text){
        text = text.toLowerCase();
        String cipherAlphabet = generateCipherAlphabet(this.key);
        String encoded = new String();

        for(int i=0; i<text.length(); i++){
            char temp = text.charAt(i);
            int tempIndex = new String(alphabet).indexOf(temp);
            if (tempIndex >= 0){
                encoded += new String(cipherAlphabet).charAt(tempIndex);
            }
            else{
                encoded += temp;
            }
        }
        return "Encoded: " + encoded;
    }

    public String decipher(String text){
        text = text.toLowerCase();

        String cipherAlphabet = generateCipherAlphabet(this.key);
        String decoded = new String();

        for(int i=0; i<text.length(); i++){
            char temp = text.charAt(i);
            int tempIndex = new String(cipherAlphabet).indexOf(temp);

            if (tempIndex >= 0){
                decoded += new String(alphabet).charAt(tempIndex);
            }
            else{
                decoded += temp;
            }
        }
        return "Decoded: " + decoded;
    }

    public String getName(){
        return this.name;
    }

    public boolean isKeyRequired(){
        return KEY_REQUIRED;
    }

    public void setKey(String key) {
        if (isKeyOnlyLetters(key)){
            this.key = key;
        }
        else{
            System.out.println("Key must be only letters!");
            System.exit(0);
        }
    }

    private Boolean isKeyOnlyLetters(String key){
        char[] chars = key.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
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
