package com.mycompany.bruteforceeffect;

import java.util.*;

public class BruteForceEffect {

    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        String input, output = "";
        int length, letterCount = 0, i;
        boolean finished = false;

        System.out.println("Enter a text to make it seem as if it is being brute forced in the console dialogue");

        input = scan.nextLine();
        length = input.length();

        if (length == 0|| input.isBlank()) {
            System.out.println("You didn't enter anything");
        } else {
            while (!finished) {

                for (i = 32; i < 127; i++) {
                    System.out.println(output + (char) i);
                    if ((char) i == input.charAt(letterCount)) {
                        letterCount++;
                        output = output + (char) i;
                        break;
                    }

                    try {
                        Thread.sleep(5);
                    } catch (Exception e) {
                    }

                }
                if (letterCount == length) {
                    finished = true;
                }
            }
        }
    }
}
