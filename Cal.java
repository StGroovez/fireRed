import java.util.Scanner;

public class Cal {
private static ListaV lista = new ListaV(); // Instancia única de Lista
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       	//Lista uno = new Lista(scanner);
		String nombre;
		
		
        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();  

        while (true) {
            System.out.println("Hola, " + nombre + ". Elija la operación que desea realizar:");
            System.out.println("1. crear lista");
            System.out.println("2. ver lista");
            System.out.println("3. modificar lista");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            if (opcion == 4) {
                System.out.println("Saliendo del programa. ¡Hasta luego, " + nombre + "!");
                break;
            }
            switch (opcion) {
                case 1:
                    /*crear lista*/
					while (true){
					lista.parametros();
                    Object[] nuevaLista = lista.crearLista();
					lista.agregarLista(nuevaLista);				
					
					System.out.print("¿Desea realizar otra lista? (Si/No): ");
					String respuesta = scanner.next().toLowerCase();
						
					if (!respuesta.equals("si")) {
						System.out.println("Saliendo de crear lista.");
						break;
						}
					}
                    break; 
                case 2:
                    /*ver lista*/
					
					lista.mostrarListas();
					//uno.mostrarListas();
                    break;
                case 3:
                    /*modificar lista*/
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una operación válida.");
                    continue;
            }

            //System.out.println("El resultado de la operación es: ");

            System.out.print("¿Desea realizar otra operación? (Si/No): ");
            String respuesta = scanner.next().toLowerCase();

            if (!respuesta.equals("si")) {
                System.out.println("Saliendo del programa. ¡Hasta luego, " + nombre + "!");
                break;
            }
        }

        scanner.close();
	}
}
