package umg.progra2.Grupo1;

import java.util.Scanner;

public class VolumenCubo {
    public static double calcularVolumenCubo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la Longitud de cada lado del Cubo: ");
        double lado = scanner.nextDouble();
        return Math.pow(lado, 3);
    }
}
