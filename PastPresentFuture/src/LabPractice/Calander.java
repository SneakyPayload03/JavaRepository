package LabPractice;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;


public class Calander {
    Scanner inputDevice = new Scanner(System.in);
    LocalDate Time = LocalDate.now();
    private int month = 4;
    private int year = 2020;
    private int userMonth;
    private int userYear;

    public int getInput() {
        int input = inputDevice.nextInt();
        return input;
    }

    public void setUserMonth() {
        Print("Enter Month:");
        userMonth = getInput();
    }

    public void setUserYear() {
        Print("User Year");
        userYear = getInput();
    }

    public void Print(String words) {
        System.out.println(words);
    }

    public void Print() {
        System.out.println();
    }

    public void Print(int number) {
        System.out.println(number);
    }

    public void Print(float f) {
        System.out.println(f);
    }


    public void Calander() {
        // executes when a Calander object is instantiated!
        setUserMonth();
        setUserYear();
        DateComparison();
    }

    public void DateComparison() {
        if (month == userMonth && year == userYear) {
            Print("Current month and year");
        }
        if (month < userMonth && year == userYear) {
            Print("Later in the year.");
        }
        if (month > userMonth && year == userYear) {
            Print("Earlier this year.");

        }
        if (year!= userYear){
            Print("Date was not of this year.");
        }

    }

}