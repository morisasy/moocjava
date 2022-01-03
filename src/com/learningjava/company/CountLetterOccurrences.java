package com.company;

public class CountLetterOccurrences {
    public static void main(String[] args) {
        // methods
        char [] letters = {'A', 'A', 'B', 'C','D', 'D','D', 'E', 'E', 'F'};
        int count = countOccurrences(letters, 'A');
        System.out.println(count);
    }

    public static int countOccurrences(char [] letters, char searchLetter){
        int count =0;
        for (char letter : letters) {
            if (letter == searchLetter){
                count++;
            }
        }
        return count;
    }
}
