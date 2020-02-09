package com.company;

public class QuartstoGallons {
    //147
    // for input pg 110 in the textbook


    private static float QuartsinGallon = 4;
    // constant
    private static float QuartsForPainting;
    private static float Gallons;
    private static float QRemaining;

    public static void ConvertQuartstoGallons() {
        float input = Input.SetNumberofQuarts();
        QuartsForPainting = input;
        QRemaining = QuartsForPainting % QuartsinGallon;
        Gallons = QuartsForPainting / QuartsinGallon;
        System.out.print("Gallons : ");
        System.out.print(Gallons);
        System.out.println();
        System.out.print("Quarts Remaining: ");
        System.out.print(QRemaining);
    }





}
