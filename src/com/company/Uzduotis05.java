package com.company;

import java.util.Scanner;

public class Uzduotis05 {
    public Uzduotis05() {
        //iveda du skaiciu
        //kreipiasi i du metodus su ower
        //isveda
        System.out.println("Įveskite du skaičius:.");


        Scanner skaitytuvas = new Scanner(System.in);
        float a = skaitytuvas.nextInt();
        float b = skaitytuvas.nextInt();

        System.out.println(suma(a, b));
        System.out.println(suma((int) a, (int) b));
        System.out.println(skirtumas(a, b));
        System.out.println(skirtumas((int) a, (int) b));
    }

    public static int suma(int a, int b) {


        return a + b;

    }

    public static float suma(float a, float b) {


        return a + b;

    }


    public static int skirtumas(int a, int b) {


        return a - b;

    }

    public static float skirtumas(float a, float b) {


        return a - b;

    }
}
