package umg.progra2.Grupo1;

import java.util.Scanner;

public class CircunferenciaCirculo {
    public static double calcularCircunferenciaCirculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el Radio del Circulo: ");
        double radio = scanner.nextDouble();
        return 2 * Math.PI * radio;
    }
}
