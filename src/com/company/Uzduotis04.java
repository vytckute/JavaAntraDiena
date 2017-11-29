package com.company;

import java.util.Scanner;

public class Uzduotis04 {
public Uzduotis04(){
    //papildyta 1.3 idedant i metodus
    System.out.println("Įveskite du skaičius:.");


    Scanner skaitytuvas = new Scanner(System.in);
    int a = skaitytuvas.nextInt();
    int b = skaitytuvas.nextInt();
    suma(a, b);
    skirtumas(a,b);
}

    public static void suma(int a, int b) {
        int c = a + b;
        System.out.print("a+b=");
        System.out.println(c);

    }


    public static void skirtumas(int a, int b) {
        int d = a - b;
        System.out.print("a-b=");
        System.out.println(d);

    }
}

