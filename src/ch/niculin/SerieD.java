package ch.niculin;

import java.util.Random;
import java.util.Scanner;

public class SerieD {
    public static void main(String[] args) {
        Random generator = new Random();
        double Zahl1;
        double Zahl2;


        Zahl1 = 1 + generator.nextInt(100);
        System.out.println("Zahl1: " + Zahl1);

        Zahl2 = 1 + generator.nextInt(100);
        System.out.println("Zahl2: " + Zahl2);




        while (true) {
            System.out.println("Was möchtest du mit diesen Zahlen machen? / oder %");
            String x = new java.util.Scanner(System.in).next();



            if (x.equals("/")) {
                Division(Zahl1, Zahl2, x);
            }
            if (x.equals("%")){
                Modulo(Zahl1, Zahl2, x);
            }
            System.out.println("Möchtest du nochmal? Ja oder Nein");
            String eingabeJaNein = new Scanner(System.in).next();
            if (eingabeJaNein.equals("Nein")){

                System.out.println("Okay goodbye!");
                break;
            }
        }



    }

    private static void Modulo(double zahl1, double zahl2, String x) {

            System.out.println(zahl1 % zahl2);

    }

    private static void Division(double zahl1, double zahl2, String x) {

            System.out.println(zahl1 / zahl2);
    }
}
