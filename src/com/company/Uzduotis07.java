package com.company;

import java.util.Scanner;

public class Uzduotis07 {
    public Uzduotis07() {
        //papildyti 1.6 naudojant metodus
        System.out.println("Įveskite savo ūgį:.");
        Scanner skaitytuvas = new Scanner(System.in);
        double ugis = skaitytuvas.nextDouble();
        System.out.println("Įveskite savo masę:.");
        double mase = skaitytuvas.nextDouble();
        System.out.println("Kmi: " + KMISkaiciavimas(ugis, mase));
    }

    public double KMISkaiciavimas(double ugis, double mase) {
        double KMI = mase / Math.pow(ugis, 2);
        return KMI;
    }
}

