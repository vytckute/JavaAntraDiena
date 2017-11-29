package com.company;

import java.util.Scanner;

public class Uzduotis12 {
    public double ugis;
    public double mase;

    public Uzduotis12() {
        System.out.println("Įveskite savo ūgį:.");
        Scanner skaitytuvas = new Scanner(System.in);
        ugis = skaitytuvas.nextDouble();
        System.out.println("Įveskite savo masę:.");
        mase = skaitytuvas.nextDouble();
        Skaiciuotuvas sk = new Skaiciuotuvas();
        System.out.println("Kmi: " + sk.KMIskai());

    }

    private class Skaiciuotuvas {
        public double KMIskai() {

            double KMI = mase / Math.pow(ugis, 2);
            return KMI;
        }
    }
}
