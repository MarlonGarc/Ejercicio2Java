package umg.progra2.Grupo1;

import java.util.Scanner;

public class AreaCirculo {
    public static double calcularAreaCirculo(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el Radio del Circulo: ");
    double radio = scanner.nextDouble();
    return Math.PI * Math.pow(radio, 2);
    }
}
