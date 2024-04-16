import java.util.Scanner;

public class PrincipalMatricial {
private static verLista lista = new verLista(); // Instancia única de Lista
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
					lista.parametros(); // Establecer los parámetros de la lista
					Object[] nuevaLista = lista.crearLista(); // Crear la lista
					lista.crearNombre(); // Agregar el nombre de la lista
					lista.agregarLista(nuevaLista); // Agregar la lista a listOfLists		
					
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
                    while (true){
						lista.mostrarListas();// Mostrar las listas existentes
						System.out.print("Seleccione el número de la lista que desea ver los elementos: ");
						int numeroLista = scanner.nextInt();
						lista.mostrarElementosLista(numeroLista);
						System.out.print("¿Desea ver otra lista? (Si/No): ");
						String respuesta = scanner.next().toLowerCase();
							
						if (!respuesta.equals("si")) {
							System.out.println("Saliendo de ver listas.");
							break;
							}
					}		
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
