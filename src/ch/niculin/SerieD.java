package ch.niculin;

import java.util.Random;

public class SerieD {
    public static void main(String[] args) {
        Random generator = new Random();
        double Zahl1;
        double Zahl2;


        Zahl1 = 1 + generator.nextInt(100);
        System.out.println("Zahl1: " + Zahl1);

        Zahl2 = 1 + generator.nextInt(100);
        System.out.println("Zahl2: " + Zahl2);

        System.out.println("Was möchtest du mit diesen Zahlen machen?  \n / Gebe eine 1 ein. \n % Gebe eine 2 ein.");
        double x = new java.util.Scanner(System.in).nextDouble();
        Division(Zahl1, Zahl2, x);
        Modulo(Zahl1, Zahl2, x);

    }

    private static void Modulo(double zahl1, double zahl2, double x) {
        if (x == 2) {
            System.out.println(zahl1 % zahl2);
        }
    }

    private static void Division(double zahl1, double zahl2, double x) {
        if (x == 1) {
            System.out.println(zahl1 / zahl2);
        }
    }
}
