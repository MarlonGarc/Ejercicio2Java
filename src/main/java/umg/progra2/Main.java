package umg.progra2;

import umg.progra2.Grupo1.AreaCirculo;
import umg.progra2.Grupo1.CircunferenciaCirculo;
import umg.progra2.Grupo1.VolumenCubo;
import umg.progra2.Grupo2.AreaPiramide;
import umg.progra2.Grupo2.AreaTriangulo;
import umg.progra2.Grupo2.VolumenPiramide;
import umg.progra2.Grupo3.AreaParalelo;
import umg.progra2.Grupo3.VolumenCilindro;
import umg.progra2.Grupo3.VolumenPrisma;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean continuar = true;
            while (continuar) {
                System.out.println("Menu de Paquetes");
                System.out.println("1. Grupo 1");
                System.out.println("2. Grupo 2");
                System.out.println("3. Grupo 3");
                System.out.println("4. Salir");
                System.out.println("Elija un paquete");
                int paquete = scanner.nextInt();
                switch (paquete) {
                    case 1:
                        mostrarMenuGrupo1(scanner);
                        break;
                    case 2:
                        mostrarMenuGrupo2(scanner);
                        break;
                    case 3:
                        mostrarMenuGrupo3(scanner);
                        break;
                    case 4:
                        continuar = false;
                        System.out.println("Salida exitosamente");
                        break;
                    default:
                        System.out.println("Opcion no Valida");
                        break;
                }
                System.out.println();
            }
            scanner.close();
        }

        public static void mostrarMenuGrupo1(Scanner scanner) {
            boolean volver = false;
            System.out.println("Menu Grupo 1, por favor elija un Ejercicio:");
            System.out.println("");
            System.out.println("1. Calcular el Area de un Circulo");
            System.out.println("2.Calcular la Circunferencia de un Circulo");
            System.out.println("3. Calcular Volumen de un Cubo");
            System.out.println("4. Volver al Menu Principal");
            System.out.println("Elija una Opcion");
            System.out.println("");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    double areaCirculo = AreaCirculo.calcularAreaCirculo();
                    System.out.println("El area del circulo es: " + areaCirculo);
                    break;
                case 2:
                    double circunCirculo = CircunferenciaCirculo.calcularCircunferenciaCirculo();
                    System.out.println("El circunferencia del circulo es: " + circunCirculo);
                    break;
                case 3:
                    double volCubo = VolumenCubo.calcularVolumenCubo();
                    System.out.println("El volumen del cubo es: " + volCubo);
                    break;
                case 4:
                    volver = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println();
        }
        public static void mostrarMenuGrupo2(Scanner scanner) {
            boolean volver = false;

            System.out.println("Menu Grupo 2, por favor elija un Ejercicio:");
            System.out.println("");
            System.out.println("1. Calcular area de una piramide cuadrada");
            System.out.println("2. Calcular el volumen de una piramide cuadrada");
            System.out.println("3. Calcular area de un triangulo");
            System.out.println("4. Volver al menu principal");
            System.out.println("Elija una opcion");
            System.out.println("");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    double areaTriangulo = AreaTriangulo.calcularAreaTriangulo();
                    System.out.println("El area del triangulo es: " + areaTriangulo);
                    break;
                case 2:
                    double areaPiramide = AreaPiramide.calcularAreaPiramide();
                    System.out.println("El area del piramide es: " + areaPiramide);
                    break;
                case 3:
                    double volPiramide = VolumenPiramide.calcularVolumenPiramide();
                    System.out.println("El volumen del piramide cuadrada es: " + volPiramide);
                    break;
                case 4:
                    volver = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println();
        }
        public static void mostrarMenuGrupo3(Scanner scanner) {
            boolean volver = false;

            System.out.println("Menu Grupo 3, por favor elija un Ejercicio:");
            System.out.println("");
            System.out.println("1. Calcular el volumen de un prisma rectangular");
            System.out.println("2. Calcular el area de un paralelogramo");
            System.out.println("3. Calcular el volumen de un cilindro");
            System.out.println("4. Volver al menu principal");
            System.out.println("Elija una opcion");
            System.out.println("");
            Scanner scanner1 = new Scanner(System.in);
            int opcion = scanner1.nextInt();
            switch (opcion) {
                case 1:
                    double volCilindro = VolumenCilindro.calcularVolumenCilindro();
                    System.out.println("El volumen del cilindro es: " + volCilindro);
                    break;
                case 2:
                    double volPrisma = VolumenPrisma.volumenPrismaRectangular();
                    System.out.println("El volumen del prisma rectangular es: " + volPrisma);
                    break;
                case 3:
                    double areaPrllogmo = AreaParalelo.calcularAreaParalelogramo();
                    System.out.println("El area del paralelogramo es: " + areaPrllogmo);
                    break;
                case 4:
                    volver = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            System.out.println();
        }
    }