import java.util.*;
public class VowelProblem {
    public static Character VowelorConsonant(char M) {
        // Convert the letter to lowercase for case-insensitive comparison
        char lowercaseM = Character.toLowerCase(M);

        // Check if the letter is a vowel
        if (lowercaseM == 'a' || lowercaseM == 'e' || lowercaseM == 'i' || lowercaseM == 'o' || lowercaseM == 'u') {
            return 'V'; // V for vowel
        } else {
            return 'C'; // C for consonant
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);
       char result = VowelorConsonant(letter);
        System.out.println(result);
    }
}

//    Vowel or Consonant
//        Problem Statement
//        Given a letter of lowercase English alphabet, your task is to determine whether it is a vowel or a consonant.
//        Input
//        User task:
//        Since this is a functional problem you don't have to worry about the input. You just have to complete the function VowelorConsonant() which contains M as a parameter.
//
//        Constraints:-
//        'a' <= alpha <= 'z'
//        Output
//        Print C if the given alphabet is Consonant else Print V.
//        Example
//        Sample Input:-
//        a
//
//        Sample Output:-
//        V
//
//        Sample Input:-
//        b
//
//        Sample Output:-
//        C
