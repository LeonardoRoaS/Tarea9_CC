import java.util.HashMap;
import java.util.Scanner;

public class SistemaUsuarios {

    //inicializamos teclado
    private static Scanner teclado = new Scanner(System.in);
    //inicializamos la tabla
    private static HashMap<String, String> usuarios = new HashMap<>();


    public static void registrarUsuario(){
        System.out.println("Ingrese nombre del usuario: ");
        String usuario = teclado.nextLine();

        if (usuarios.containsKey(usuario)){
            System.out.println("ERROR: El nombre de Usuario ya existe");
            return;
        }

        System.out.println("Ingrese la contraseña: ");
        String contraseña = teclado.nextLine();

        usuarios.put(usuario, contraseña);
        System.out.println("Usuario registrado correctamente.");

    }

    public static void main(String[] args) {

    }

}