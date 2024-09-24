package umg.progra2.Grupo3;

import java.util.Scanner;

public class AreaParalelo {
    public static double calcularAreaParalelogramo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la Longitud de la Base del Paralelogramo");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la Altura del Paralelogramo");
        double altura = scanner.nextDouble();
        return base * altura;
    }
}
