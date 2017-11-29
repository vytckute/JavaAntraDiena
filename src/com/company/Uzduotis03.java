package com.company;

import java.util.Scanner;

public class Uzduotis03 {
    // įveskite du skaicius
    //išvesti skirtuma ir suma
    public Uzduotis03 ()

    {
        System.out.println("Įveskite du skaičius:.");


        Scanner skaitytuvas = new Scanner(System.in);
        int a = skaitytuvas.nextInt();
        int b = skaitytuvas.nextInt();

        int c = a + b;
        System.out.print("a+b=");
        System.out.println(c);
        int d = a - b;
        System.out.print("a-b=");
        System.out.println(d);

    }
}