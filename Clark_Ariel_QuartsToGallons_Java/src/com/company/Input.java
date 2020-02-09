package com.company;
import java.util.Scanner;


public class Input {
    public static Float SetNumberofQuarts() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Number of Quarts : ");
        Float input = inputDevice.nextFloat();
        return input;

    }

}
