package umg.progra2.Grupo3;

import java.util.Scanner;

public class VolumenPrisma {
    public static double volumenPrismaRectangular() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el Area de la Base del Prisma: ");
        double area_base = scanner.nextDouble();
        System.out.println("Ingrese la Altura del Prisma: ");
        double altura = scanner.nextDouble();
        return area_base * altura;
    }
}
