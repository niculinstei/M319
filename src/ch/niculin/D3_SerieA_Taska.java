package ch.niculin;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class D3_SerieA_Taska {
    public static void main(String[] args) {
        System.out.println("gebe Text ein:");
        int counter = 0;
        String[] statics = new String[5];
        StringBuilder string = new StringBuilder();
        for (String eingabeSatz = ""; !Objects.equals(eingabeSatz, "."); ) {
            eingabeSatz = new Scanner(System.in).next();
            statics[counter] = eingabeSatz;
            string.append(eingabeSatz).append(" ");
            counter++;
        }
        String[] dynamic = Arrays.copyOf(statics, statics.length);

        System.out.println(string);

        for (int i = statics.length - 1; i >= 0; i--) {
            System.out.print(statics[i] + " ");
        }
        System.out.println("");
        for (int i = dynamic.length - 1; i >= 0; i--) {
            System.out.print(dynamic[i] + " ");
        }

    }
}
