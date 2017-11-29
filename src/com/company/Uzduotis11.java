package com.company;

import java.util.Scanner;

public class Uzduotis11 {
    public Uzduotis11() {
        System.out.println("Iveskite du skaicius: ");
        Scanner skaitytuvas = new Scanner(System.in);
        float a = skaitytuvas.nextInt();
        float b = skaitytuvas.nextInt();
        System.out.println("Suma" + Suma(a, b));
        System.out.println("Suma" + Suma((int) a, (int) b));
        System.out.println("Skirtumas" + Skirtumas(a, b));
        System.out.println("Skirtumas" + Skirtumas((int) a, (int) b));
        System.out.println("Sandauga" + Sandauga(a, b));
        System.out.println("Sandauga" + Sandauga((int) a, (int) b));
    }

    public static int Suma(int a, int b) {
        return a + b;
    }

    public static float Suma(float a, float b) {
        return a + b;
    }

    public static int Skirtumas(int a, int b) {
        return a + b;
    }

    public static float Skirtumas(float a, float b) {
        return a + b;
    }


    public static int Sandauga(int a, int b) {
        return a * b;
    }

    public static float Sandauga(float a, float b) {
        return a * b;
    }
}



