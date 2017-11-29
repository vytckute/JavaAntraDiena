package com.company;

import java.util.Scanner;

public class Uzduotis09 {
    public static float km;
    public static float kurosanaudos;

    public Uzduotis09() {
        //ivesti nuvaziuotus km ir kuro sanaudas
        //apskaiciuoti vidurki
        //papildyti metodais vidurkio skaiciavimo ir skaitymui


        ivesti();
        System.out.println("Kuro sanaudu vidurkis: " + vidurkis(km, kurosanaudos));

    }

    public void ivesti() {
        System.out.println("Įveskite nuvažiuotus km ir kuro sanaudas.");
        Scanner skaitytuvas = new Scanner(System.in);
        km = skaitytuvas.nextFloat();
        kurosanaudos = skaitytuvas.nextFloat();
    }

    public double vidurkis(double km, double kurosanaudos) {
        double vid = (kurosanaudos * 100) / km;
        return vid;
    }
}

