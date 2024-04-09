import java.util.Scanner;
public class General {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Seleccione opción: ");
       
        public class crearLista {
            package crearLista;

    public class crearLista {
        public String[] lista(String name, int elements, String[] nuevaLista){

            System.out.println("Escribe el número de elementos que va a tener el array");

         String[] listaNueva = new String[elements]; 

            for(int i = 0; i){

            }



        return nuevaLista;
        }
    }

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

            /*System.out.print("Ingrese el primer valor: ");
            int a = scanner.nextInt();
            System.out.print("Ingrese el segundo valor: ");
            int b = scanner.nextInt();

            int resultado = 0;*/

            switch (opcion) {
                case 1:
                    crearLista = 0;
                    break;
                case 2:
                    verLista = 0;
                    break;
                case 3:
                    modificarLista = 0;
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
}