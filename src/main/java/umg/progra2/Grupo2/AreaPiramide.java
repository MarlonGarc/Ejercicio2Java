package umg.progra2.Grupo2;

import java.util.Scanner;

public class AreaPiramide {
    public static double calcularAreaPiramide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la Longitud de la Base de la Piramide");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la Altura de la Piramide");
        double altura = scanner.nextDouble();
        return (base * altura) / 2;
    }
}
