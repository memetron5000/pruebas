import java.util.Scanner;
public class direccion extends Usuario {
    

    public static String getDireccion(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingrese su direccion");
        String dir = scanner.nextLine();
        scanner.close();
        String[] partes;
        partes = dir.split(" ");
        try {
        String calle=partes[1]+" "+partes[2];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            String calle="null";
        }
        
        String nomenclatura=partes[1]+" "+partes[2];
        String barrio=partes[1]+" "+partes[2];
        String ciudad=partes[1]+" "+partes[2];

        for (String i : partes) {
            System.out.println(i);
        }
        return dir;
    }

}
