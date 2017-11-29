package com.company;

import java.util.Scanner;

public class Uzduotis02 {
    public Uzduotis02() {
        // įveskite žodį
        //išvesti kiek simbolių žodyje
        System.out.println("Sveiki, įveskite žodį.");


        Scanner skaitytuvas = new Scanner(System.in);
        String word = skaitytuvas.nextLine();

        System.out.println("Zodyje simboliu yra: "+word.length());

    }

}
