import java.util.Scanner;

public class Principal {        
    static Lista[] listas = new Lista[1];
    static int numeroListas = 0;
    static Scanner sc = new Scanner(System.in);
    static int opcion = 0;

    public static void main(String[] args) {
            inicio();
            while (opcion != 4) {
                switch (opcion) {
                    case 1:
                        crearLista();
                        inicio();     
                        break;       
                    case 2:
                        mostrarListas();
                        inicio();     
                        break;
                    case 3:
                        modificarListas();
                        inicio();     
                    break; 
                }
            }
        }

    static void inicio(){
        System.out.print("Seleccione opción: ");
        while (true) {
            System.out.println("Hola, Elija la operación que desea realizar:");
            System.out.println("1. Crear Lista");
            System.out.println("2. Ver Lista");
            System.out.println("3. Modificar Lista");
            System.out.println("4. Salir");  
            
            opcion = Lista.validacionNumero();         

            if (opcion == 4) {
                System.out.println("Saliendo del programa. ¡Hasta luego!");
                break;
            }           
            break;
        }
    }

    static void mostrarListas(){  
        if (listas != null && listas.length > 0) {
            if (numeroListas == 0) {
                System.out.println("No hay listas creadas");
            } else {
                System.out.println("Listas disponibles:");
                for (int i = 0; i < numeroListas; i++) {
                    System.out.println("Lista " + (i + 1) + ": " + listas[i].getNombre());
                    System.out.println("Elementos: ");
                    listas[i].mostrarElementos();
                }
            }
        }
    }
        
    static void crearLista() {
        /*
         * numeroListas rastrea el número de listas creadas 
         * Antes de hacer una lista checa si numeroListas es mayor o igual a la capacidad del array
         * Si hay mas número de listas existentes que la capacidad del array listas, entonces le agrega más capacidad al array
         */
        if (numeroListas >= listas.length) {
            Lista[] newListas = new Lista[listas.length + 1];
           
           /* Mapea los objetos al nuevo array */
            for (int i = 0; i < listas.length; i++) {
                newListas[i] = listas[i];
            }
            listas = newListas;
        }  
        System.out.println("Nombre de la lista: ");
        String name = Lista.validarNombre();
        int num = Lista.validacionElementos();   
        /* Agrega la nueva lista al index que equivale al contador de número de listas creadas */
        listas[numeroListas] = new Lista(name, num);
        /* Incrementa el contador para la creación de la próxima lista */
        numeroListas++;
    }

        static void modificarListas(){
            if (listas != null && listas.length > 0) {
                if (numeroListas == 0) {
                    System.out.println("No hay listas creadas");
                }
                else {
                    System.out.println("Selecciona el indice de la lista que desees modificar: ");
                    System.out.println("Nombres de de las listas disponibles: ");
                    for (int i = 0; i < numeroListas; i++) {
                        System.out.println((i+1) + " " + listas[i].getNombre());
                    }    
                    int listaSeleccionada = Lista.validacionNumero();
                    if (listaSeleccionada >= 1 && listaSeleccionada <= listas.length) {
                        System.out.println("Seleccionaste la lista: " + listas[listaSeleccionada - 1].nombre);
                        System.out.println("Elija la operación que desee realizar");
                        System.out.println("1. Cambiar elementos de posición");
                        System.out.println("2. Borrar un elemento");
                        System.out.println("3. Agregar un elemento");
                        System.out.println("4. Modificar elemento de la lista");
                        System.out.println("5. Regresar al menú principal");
                
                        int opcionModificacion = Lista.validacionNumero();    
                
                        switch (opcionModificacion) {
                            case 1:
                                listas[listaSeleccionada - 1].getNombre();
                                listas[listaSeleccionada - 1].mostrarElementos();
                                System.out.println("Ingresa el número del primer elemento que deseas intercambiar:");
                                int indiceElemento1 = Lista.validacionNumero();
                                System.out.println("Ingresa el número del segundo elemento que deseas intercambiar:");
                                int indiceElemento2 = Lista.validacionNumero();
                                listas[listaSeleccionada - 1].cambiarElementos(indiceElemento1, indiceElemento2);
                                break;
                            case 2:
                                listas[listaSeleccionada - 1].getNombre();
                                listas[listaSeleccionada - 1].mostrarElementos();
                                System.out.println("Ingresa el elemento que deseas borrar:");
                                int elementoBorrar = Lista.validacionNumero();
                                listas[listaSeleccionada - 1].borrarElemento(elementoBorrar);
                                break;                            
                            case 3:
                                listas[listaSeleccionada - 1].getNombre();
                                listas[listaSeleccionada - 1].mostrarElementos();
                                System.out.println("Ingresa el elemento que quieres agregar a la lista:");
                                String elementoAgregar = Lista.validarNombre();
                                listas[listaSeleccionada - 1].agregarElemento(elementoAgregar);
                                break;
                            case 4:
                                listas[listaSeleccionada - 1].getNombre();
                                listas[listaSeleccionada - 1].mostrarElementos();
                                System.out.println("Ingresa el índice del elemento que quieres modificar: ");
                                int modificarIndiceElemento = Lista.validacionNumero();
                                System.out.println("Ingresa el nuevo valor del elemento: ");
                                String nuevoValorElemento = Lista.validarNombre();
                                listas[listaSeleccionada - 1].modificarElemento(modificarIndiceElemento, nuevoValorElemento);
                                break;
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                    } else {
                        System.out.println("El número de lista ingresado no es válido.");
                }
            }
        }
    }
}

