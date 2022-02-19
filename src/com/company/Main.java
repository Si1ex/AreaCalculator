package com.company;
import java.util.Scanner;

public class Main {
    static double sade;
    static double sivu;
    static double korkeus;

    public Main(double sade) {
    }

    public Double pintaAla(Double sade) {
        Double ympyra = sade * sade * Math.PI;
        return ympyra;
    }
    public Double pintaAla() {
        Double nelio = (sivu * sivu);
        return nelio;
    }
    public Double pintaAla(Double sade, Double korkeus) {
        Double sylinteri = Math.PI * sade * sade * korkeus;
        return sylinteri;
    }
    public static void main(String[] args) {

        Scanner eka = new Scanner(System.in);
        System.out.println("Anna säde desimaalilukuna");
        sade = eka.nextDouble();
        Main ala = new Main(sade);

        Scanner toinen = new Scanner(System.in);
        System.out.println("Anna sivun pituus desimaalilukuna");
        sivu = toinen.nextDouble();
        Main ala1 = new Main(sivu);

        Scanner kolmas = new Scanner(System.in);
        System.out.println("Anna korkeus desimaalilukuna");
        korkeus = kolmas.nextDouble();
        Main ala2 = new Main(korkeus);

        System.out.println("Ympyrän pinta-ala on: " + ala.pintaAla(sade));
        System.out.println("Neliön pinta-ala on: " + ala1.pintaAla());
        System.out.println("Sylinterin pinta-ala on: " + ala2.pintaAla(sade, korkeus));
    }
}
