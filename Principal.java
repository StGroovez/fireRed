import java.util.Scanner;
public class Principal {        
    
    static Lista[] listas = new Lista[];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		ModificarListas Modificar = new ModificarListas(); 
        
        System.out.print("Seleccione opción: ");

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
                    /*crearLista = 0;*/
                    Scanner sc = new Scanner(System.in);
                    String name;
                    int num;
            
                    for (int i = 0; i < listas.length; i++) {
                        Lista lista = new Lista();
            
                        System.out.println("Nombre de la lista: ");
                        name = sc.nextLine();
                        lista.setNombre(name);
                        
                        System.out.println("Ingresa el número de elementos de tu lista, puede ser entre 1 y 25 ");
                        while(true){
                            if (sc.hasNextInt()) {
                                num = sc.nextInt();
                                sc.nextLine();
                                lista.setNumeroElementos(num);
                                break;
                            }
                            else{
                                System.out.println("Debes ingresar un número entero, vuelve a intentarlo: ");
                                sc.next();
                            }
                        }
                        lista.agregarElementos();
                        listas[i] = lista;
                        
                    }
                    for (int i = 0; i < listas.length; i++) {
                        listas[i].mostrarElementos();
                    }

                    for(int i=0; listas.length > i; i++){
                        System.out.println("Lista "+ (i+1) + ": " + listas[i].nombre);
                    }
                    

                    break;
                
				case 2:

                   for(int i=0; listas.length > i; i++){
                      System.out.println("Lista "+ (i+1) + ": " + listas[i].nombre);
                    }
				
					 break;
					 
                case 3:
                    /*modificarLista = 0;*/
					Modificar.mostrarListas();
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una acción válida.");
                    continue;
            }

            System.out.print("¿Desea realizar otra acción? (Si/No): ");
            String respuesta = scanner.next().toLowerCase();

            if (!respuesta.equals("si")) {
                System.out.println("Saliendo del programa. ¡Hasta luego!");
                break;
            }
        }
    }
}
