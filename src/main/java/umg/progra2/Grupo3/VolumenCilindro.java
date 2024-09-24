package umg.progra2.Grupo3;

import java.util.Scanner;

public class VolumenCilindro {
    public static double calcularVolumenCilindro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el Radio de la Base del Cilindro: ");
        double radio = scanner.nextDouble();
        System.out.println("Ingrese la Altura del Cilindro: ");
        double altura = scanner.nextDouble();
        return Math.PI * Math.pow(radio, 2) * altura;
    }
}
