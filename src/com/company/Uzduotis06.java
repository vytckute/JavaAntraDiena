package com.company;

import java.util.Scanner;

public class Uzduotis06 {
    public Uzduotis06(){
        // write your code here
        //prasom ivesti uki ir mase
        //paskaiciuojam KMI
        System.out.println("Įveskite savo ūgį:.");
        Scanner skaitytuvas = new Scanner(System.in);
        double ugis = skaitytuvas.nextDouble();
        System.out.println("Įveskite savo masę:.");
        double mase = skaitytuvas.nextDouble();
        double KMI = mase / Math.pow(ugis,2);
        System.out.println("Kmi: "+KMI);

    }
}
