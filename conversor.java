import java.util.*;

public class conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double resultado, kilometros, litros, centimetros,gramos;
        do {
            System.out.println("Menú de opciones");
            System.out.println("1.-Kilometros a millas");
            System.out.println("2.-Litros a galones");
            System.out.println("3.-gramos a onzas");
            System.out.println("4.- centimetros a pulgadas");
            System.out.println("5.-Salir");
            System.out.println("Elige una opción:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido Kilometros a milllas");
                    System.out.print("Ingresa los kilometros:");
                     kilometros = scanner.nextDouble();
                     resultado = kilometros * 0.621371;
                     System.out.println("resultado en millas:" + resultado);
                    break;
                case 2:
                    System.out.println("Has elegido litros a galones");
                    System.out.print("Ingresa los litros:");
                     litros = scanner.nextDouble();
                     resultado = litros * 0.264172;
                     System.out.println("resultado en galones:" + resultado);
                    break;
                case 3:
                    System.out.println("Has elegido gramos a onzas");
                    System.out.print("Ingresa los gramos:");
                     gramos = scanner.nextDouble();
                     resultado = gramos * 0.03527396;
                     System.out.println("resultado en onzas:" + resultado);
                     break;
                case 4:
                     System.out.println("Has elegido centimetros a pulgadas");
                     System.out.print("Ingresa los centimetros:");
                      centimetros = scanner.nextDouble();
                      resultado = centimetros * 0.393701;
                      System.out.println("resultado en pulgadas:" + resultado);
                    break;
            
                default:
                System.out.println("Adios....");
                    break;
            }

        } while (opcion != 5);
        scanner.close();
    }
}
