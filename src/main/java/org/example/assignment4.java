/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;

public class assignment4 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Noun: ");
        String noun = scan.nextLine();

        System.out.println("Verb: ");
        String verb = scan.nextLine();

        System.out.println("Adjective ");
        String adjective = scan.nextLine();

        System.out.println("Adverb ");
        String adverb = scan.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + " ?" + " That's hilarious! ");
    }

}