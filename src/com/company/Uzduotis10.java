package com.company;

import java.util.Scanner;

//ivedam skaicius
//skaiciuojam suma, skirtuma, sandauga
public class Uzduotis10 {
    public Uzduotis10() {

        System.out.println("Iveskite du skaicius: ");
        Scanner skaitytuvas = new Scanner(System.in);
        int a = skaitytuvas.nextInt();
        int b = skaitytuvas.nextInt();
        System.out.println("Suma" + Suma(a, b));
        System.out.println("Skirtumas" + Skirtumas(a, b));
        System.out.println("Sandauga" + Sandauga(a, b));
    }

    public static int Suma(int a, int b) {
        return a + b;
    }

    public static int Skirtumas(int a, int b) {
        return a + b;
    }

    public static int Sandauga(int a, int b) {
        return a * b;
    }
}