package com.codingProblem;

import java.util.Scanner;

public class VowelOrConsonent {
        public static void main(String[] args) {
            char alfa;
            System.out.println("Enter The Alphabate");
            Scanner sc = new Scanner(System.in);
            alfa=sc.next().charAt(0);
            sc.close();
            if (alfa == 'a' || alfa == 'e' || alfa == 'o' || alfa == 'i' || alfa == 'u') {
                System.out.println("This is a Vowel");
            } else {
                System.out.println("this is Consonant");
            }

        }
}
