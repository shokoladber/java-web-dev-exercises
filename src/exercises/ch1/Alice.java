package exercises.ch1;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        String rawSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        String firstSentence = rawSentence.toLowerCase();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a term to search for: ");
        String searchTerm = input.nextLine().toLowerCase();
        System.out.println("");

        Boolean result = firstSentence.contains(searchTerm);
        System.out.println("The first sentence contains your search term: " + result);

        Integer index = firstSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". " + "Your term is " + length + " characters long.");

        String modifiedSentence = firstSentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);
    }
}
