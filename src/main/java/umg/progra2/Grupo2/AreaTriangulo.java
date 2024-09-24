package umg.progra2.Grupo2;

import java.util.Scanner;

public class AreaTriangulo {
    public static double calcularAreaTriangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la Base del Triangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la Altura del Triangulo: ");
        double altura = scanner.nextDouble();
        return (base * altura)/ 2;
    }
}
