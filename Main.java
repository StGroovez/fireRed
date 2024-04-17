import java.util.Scanner;
public class Main {        
    
    static Lista[] listas;
    static int numeroListas;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Seleccione opción: ");
        while (true) {
            System.out.println("Hola, Elija la operación que desea realizar:");
            System.out.println("1. Crear Lista");
            System.out.println("2. Ver Lista");
            System.out.println("3. Modificar Lista");
            System.out.println("4. Salir");
    
            int opcion = sc.nextInt();

            if (opcion == 4) {
                System.out.println("Saliendo del programa. ¡Hasta luego!");
                break;
            }

            switch (opcion) {
                case 1:
                    String name;
                    int num = 0;

                    System.out.println("¿Cuántas listas quieres hacer?");
                    numeroListas = Lista.validacionNumero();
                    listas = new Lista[numeroListas];

                    for (int i = 0; i < listas.length; i++) {
                        System.out.println("Nombre de la lista: ");
                        name = Lista.validarNombre();
                        num = Lista.validacionElementos();
                        listas[i] = new Lista(name, num);
                    }

                    for (int i = 0; i < listas.length; i++) {
                        listas[i].mostrarElementos();
                    }
                    break;
                
                case 2:
                    for (int i = 0; i < listas.length; i++) {
                        listas[i].mostrarElementos();
                    }
                    break;
                case 3:
                    System.out.println("Selecciona el indice de la lista que desees modificar: ");
                    System.out.println("Nombres de de las listas disponibles: ");
                    for (int i = 0; i < listas.length; i++) {
                        System.out.println((i+1) + " " + listas[i].nombre);
                    }    
                    int listaSeleccionada = Lista.validacionNumero();
            
                if (listaSeleccionada >= 1 && listaSeleccionada <= listas.length) {
                    System.out.println("Seleccionaste la lista: " + listas[listaSeleccionada - 1].nombre);
                    System.out.println("¿Qué deseas hacer?");
                    System.out.println("1. Cambiar elementos de posición");
                    System.out.println("2. Borrar un elemento");
                    System.out.println("3. Agregar un elemento");
                    System.out.println("4. Modificar elemento de la lista");
                    System.out.println("5. Regresar al menú principal");
            
                    int opcionModificacion = Lista.validacionNumero();
                    sc.nextLine();
            
                    switch (opcionModificacion) {
                        case 1:
                            for (int i = 0; i < listas.length; i++) {
                                listas[i].mostrarElementos();
                            }
                            System.out.println("Ingresa el número del primer elemento que deseas intercambiar:");
                            int indiceElemento1 = Lista.validacionNumero();
                            System.out.println("Ingresa el número del segundo elemento que deseas intercambiar:");
                            int indiceElemento2 = Lista.validacionNumero();

                            listas[listaSeleccionada - 1].cambiarElementos(indiceElemento1, indiceElemento2);
                            break;
                        case 2:
                            System.out.println("Ingresa el elemento que deseas borrar:");
                            String elementoBorrar = sc.nextLine();
                            listas[listaSeleccionada - 1].borrarElemento(elementoBorrar);
                            break;
                        
                        case 3:
                            System.out.println("Ingresa el elemento que quieres agregar a la lista:");
                            String elementoAgregar = sc.nextLine();
                            listas[listaSeleccionada - 1].agregarElemento(elementoAgregar);
                            break;
                        case 4:
                            System.out.println("Ingresa el índice del elemento que quieres modificar: ");
                            int modificarIndiceElemento = Lista.validacionNumero();
                            System.out.println("Ingresa el nuevo valor del elemento: ");
                            String nuevoValorElemento = sc.nextLine();
                            listas[listaSeleccionada - 1].modificarElemento(modificarIndiceElemento, nuevoValorElemento);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                } else {
                    System.out.println("El número de lista ingresado no es válido.");
                }
                break;
            }
        }
    }
}
