import java.util.ArrayList;

public class Strings_Loops_File_IO {
    public static void main(String[] args) {

        // Welcome Statement
        System.out.printf("\nHello and welcome to Aug 31st's Catch Up Day! \nWe'll be going over Strings, Loops, File I/O\n\n");

        // String
        String phrase = "The quick brown fox jumped over the lazy dog";

        // Return "Brown Fox", Hard Coded Solution
        System.out.println( phrase.indexOf("brown fox"));
        System.out.println( phrase.substring(10,19));

        // Return "Brown Fox", Dynamic Solution
        int theCharIndex = 0;
        theCharIndex = phrase.indexOf("brown fox");

        if (theCharIndex != -1) {
            String myStr02 = phrase.substring(theCharIndex, theCharIndex + 9); // Adjust the ending index
            System.out.println("\nThe substring is: " + myStr02);
        } else {
            System.out.println("Substring not found.");
        }

        // While & For Loop Review
        int i = 1;

        while ( i <= 10){
            System.out.println(i);
            i++;
        }

        // Array of Strings
        String[] friends = {"Jim", "Angela", "Oscar"};

        for ( i = 0 ; i < friends.length; i++ ) {
            System.out.println(friends[i]);
        }

        for (String friend : friends) {
            System.out.println(friend);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);

        for (int a : numbers) {
            System.out.println(a);
        }

    }
}