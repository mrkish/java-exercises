package org.launchcode.java.studios;
import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        String loremText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        HashMap<Character, Integer> charCount = new HashMap<>();

        char[] charactersInString = loremText.toCharArray();

        for (int i = 0; i < charactersInString.length; i++) {
            char letter = charactersInString[i];
            char setterLetter = '\0';
            if(Character.isUpperCase(letter) == true && Character.isLetter(letter)) {
                char loweredLetter = letter;
                setterLetter = Character.toLowerCase(letter);
            } else if (Character.isLetter(letter) && !Character.isSpaceChar(letter) && !Character.isWhitespace(letter)) {
                setterLetter = letter;
            }
            if (charCount.containsKey(letter) == true) {
                charCount.put(setterLetter, charCount.get(letter) + 1);
            } else {
                charCount.put(setterLetter, 1);
            }
        }
        for(char key : charCount.keySet()) {
            System.out.println(key + ": " + charCount.get(key));
        }
        }
    }
