import java.util.HashMap;
import java.util.Scanner;

public class SistemaUsuarios {

    //inicializamos teclado
    private static Scanner teclado = new Scanner(System.in);
    //inicializamos la tabla
    private static HashMap<String, String> usuarios = new HashMap<>();


    public static void registrarUsuario() {
        System.out.println("Ingrese nombre del usuario: ");
        String usuario = teclado.nextLine();

        if (usuarios.containsKey(usuario)) {
            System.out.println("ERROR: El nombre de Usuario ya existe");
            return;
        }

        System.out.println("Ingrese la contraseña: ");
        String contraseña = teclado.nextLine();

        usuarios.put(usuario, contraseña);
        System.out.println("Usuario registrado correctamente.");

    }

    public static void iniciarSesion(){
        System.out.println("Ingrese el nombre de usuario: ");
        String usuario = teclado.nextLine();

        System.out.println("Ingrese su contraseña: ");
        String contraseña = teclado.nextLine();

        if (usuarios.get(usuario).equals(contraseña)){
            System.out.println("Acceso concedido. Bienvenido "+usuario+"!.");
        }else{
            System.out.println("ERROR: Usuario no encontrado o contraseña incorrecta.");
        }
    }

    public static void iniciarSistema(){
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("===== MENÚ DEL SISTEMA =====");
            System.out.println("1. Registrar usuario.");
            System.out.println("2. Iniciar Sesion.");
            System.out.println("3. Salir.");
            System.out.println("Seleccione una opción.");

            opcion = teclado.nextInt();

            teclado.nextLine();

            switch (opcion) {
                case 1:
                    registrarUsuario();
                    break;
                case 2:
                    iniciarSesion();
                    break;
                case 3:
                    System.out.printf("Saliendo del sistema.");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Ejecutando sistema...");
        iniciarSistema();
    }
}