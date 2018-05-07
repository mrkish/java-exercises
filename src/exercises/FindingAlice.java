package exercises;

import java.util.Scanner;

public class FindingAlice {
    public static void main(String[] args) {
        String aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner in = new Scanner(System.in);
        System.out.println("What word would you like to search for?: ");
        String wordToFind = in.nextLine();
        String loweredWordToFind = wordToFind.toLowerCase();
        String loweredAliceText = aliceText.toLowerCase();

        if (aliceText.contains(wordToFind)) {
            System.out.println(wordToFind + " is in the searched text!");
        } else if (loweredAliceText.contains(loweredWordToFind)) {
            System.out.println(wordToFind + " (or some differently capitalized version) is in the searched text!");
        } else {
            System.out.println("Searched text '" + wordToFind + "' does not appear!");
        }
    }
}
