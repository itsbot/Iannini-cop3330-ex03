/*
 *  UCF COP3330 Fall 2021 Exercise 3 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise03;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        System.out.println("Enter a quote");
        Scanner sc = new Scanner(System.in);
        String quote = sc.nextLine();
        System.out.println("Who said it?");
        Scanner sc1 = new Scanner(System.in);
        String speaker = sc1.nextLine();

        System.out.println(speaker+" says, "+"\""+quote+".\"");
    }
}
