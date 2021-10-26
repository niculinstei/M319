package ch.niculin;

import java.util.Scanner;

public class D3_SerieA_Taska {
    public static void main(String[] args) {
        System.out.println("gebe Text ein:");
        String eingabeSatz = new Scanner(System.in).nextLine();

        String[] strings = eingabeSatz.split("\\.");
        for(int i = strings.length-1; i >= 0 ; i--){
            System.out.print(strings[i] + " ");
        }
    }
}
