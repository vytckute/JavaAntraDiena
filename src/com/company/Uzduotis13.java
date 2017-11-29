package com.company;

import java.util.Scanner;

//iveda skaicius
//ieskom kvadrata
public class Uzduotis13 {
    public Uzduotis13() {

        System.out.println("Iveskite skaiciu kurio kvadrata ieskosime");
        Scanner skaitytuvas = new Scanner(System.in);
        double a = skaitytuvas.nextDouble();
        Skaiciuotuvas sk = new Skaiciuotuvas();
        System.out.println("Kvadratas "+a+"="+ sk.SkaiciuojaKvadrata(a));

    }


private class Skaiciuotuvas {
    public double SkaiciuojaKvadrata(double a) {

        return Math.pow(a, 2);
    }
}}
