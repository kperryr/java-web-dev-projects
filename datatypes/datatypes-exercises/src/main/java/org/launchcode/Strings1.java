package org.launchcode;

import java.util.Scanner;

public class Strings1 {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures " +
                "or conversation?’";
        alice = alice.toLowerCase();
        Scanner input1 = new Scanner(System.in);
        System.out.println("Hello, please enter a word");
        String word =input1.next();
        word = word.toLowerCase();



        int index = alice.indexOf(word);
        int length = word.length();
        int end = index + length;
        String aliceA = alice.replace(word,"");

       System.out.println(  aliceA );
    }
}
