import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ModificarListas Modificar = new ModificarListas(); 
		
		while (true) {
            System.out.println("Hola, Elija la operación que desea realizar:");
            System.out.println("1. Crear Lista");
            System.out.println("2. Ver Lista");
            System.out.println("3. Modificar Lista");
            System.out.println("4. Salir");
    
            int opcion = scanner.nextInt();

            if (opcion == 4) {
                System.out.println("Saliendo del programa. ¡Hasta luego, !");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
					Modificar.mostrarListas();
					
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una acción válida.");
                    continue;
            }

            System.out.print("¿Desea realizar otra acción? (Si/No): ");
            String respuesta = scanner.next().toLowerCase();

            if (!respuesta.equals("si")) {
                System.out.println("Saliendo del programa. ¡Hasta luego, !");
                break;
            }
        }
	}
}