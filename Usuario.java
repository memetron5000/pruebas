import java.util.Scanner;

public class Usuario {
    private String nombre;
    private Long ID;
    private String fecha_nacimiento;
    private String ciudad_nacimiento;
    private Long tel;
    private String email;
    private String dir;

public static String getusuario (){
    Scanner scanner = new Scanner (System.in);
    System.out.println("ingrese su nombre de usuario");
    String nombre =scanner.nextLine();
    scanner.close();
    return nombre;
}
public static long getid (){
    Scanner scanner = new Scanner (System.in);
    System.out.println("ingrese su nombre de usuario");
    long ID =scanner.nextLong();
    scanner.close();
    return ID;
}
public static long gettel (){
    Scanner scanner = new Scanner (System.in);
    System.out.println("ingrese su nombre de usuario");
    long tel =scanner.nextLong();
    scanner.close();
    return tel;
}
public static String getemail (){
    Scanner scanner = new Scanner (System.in);
    System.out.println("ingrese su nombre de usuario");
    String email =scanner.nextLine();
    scanner.close();
    return email;
}


    public static void main(String[] args) {

        //todo: usuario 1 en el sistema
        Usuario persona1= new Usuario();
            persona1.nombre="Santiago Ramos Galvis";
            persona1.ID=(long)1023345678;
            persona1.fecha_nacimiento="30/11/2003";
            persona1.tel=(long) 314853357;
            persona1.email="hola@whatsapp.com";
            persona1.dir="Calle 54A No. 30-01 Barrios Boston";
            
        //todo: usuario 2 en el sistema
        Usuario persona2= new Usuario();
            persona1.nombre="Nicole Natalia Guarandai";
            persona1.ID=(long)1043258294;
            persona1.fecha_nacimiento="30/11/2003";
            persona1.tel=(long) 314874458;
            persona1.email="gusbai@whatsapp.com";
            persona1.dir="Calle 11A No. 20-12 Barrios tunja";


        Usuario persona3= new Usuario();
            // persona3.nombre=Usuario.getusuario();
            // persona3.ID=Usuario.getid();
            // persona3.fecha_nacimiento=Fecha.obtenerFecha();
            // persona3.tel=Usuario.gettel();
            // persona3.email=Usuario.getemail();
            persona3.dir=direccion.getDireccion();

        
            // Scanner aa = new Scanner(System.in);
            // System.out.println("ingrese su nombre de usuario");
            // Scanner nombre= new Scanner(System.in);
            // System.out.println("ingrese su id");
            // Scanner ID= new Scanner(System.in);
            // System.out.println("ingrese su ciudad de nacimiento");
            // Scanner ciudad_nacimiento= new Scanner(System.in);
            // System.out.println("ingrese telefono");
            // Scanner tel= new Scanner(System.in);
            // System.out.println("ingrese su email");
            // Scanner email= new Scanner(System.in);

        
        

    
    }
}
