package com.company;

import java.util.Scanner;

public class Uzduotis08 {
    public Uzduotis08() {
        //ivesti nuvaziuotus km ir kuro sanaudas
        //apskaiciuoti vidurki
        System.out.println("Įveskite nuvažiuotus km ir kuro sanaudas: ");
        Scanner Skaitytuvas = new Scanner(System.in);
        double km = Skaitytuvas.nextDouble();
        double sanaudos = Skaitytuvas.nextDouble();
        double vidurkis = (sanaudos * 100) / km;
        System.out.println("Vidurkis: " + vidurkis);

    }
}
