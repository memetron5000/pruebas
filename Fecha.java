import java.util.Scanner;

public class Fecha extends Usuario {
    
    public static String obtenerFecha() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el día de nacimiento:");
        short dd = scanner.nextShort();
        System.out.println("Ingrese el mes de nacimiento:");
        short mm = scanner.nextShort();
        System.out.println("Ingrese el año de nacimiento:");
        short aa = scanner.nextShort();
        scanner.close();
        return dd + "-" + mm + "-" + aa;
    }
    
}