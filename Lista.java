package Lista;
import java.util.Scanner;

public class Lista {
    /* ATRIBUTOS DE LA LISTA */

    String[] elementos = {};
    String nombre;
    int numeroElementos;
    int maximoElementos = 25;
    
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        Lista[] listas = new Lista[3];

        for (int i = 0; i < listas.length; i++) {
            Lista lista = new Lista();

            System.out.println("Nombre de la lista: ");
            String name = sc.nextLine();
            lista.setNombre(name);
            
            System.out.println("Ingresa un número entre 1 y 25 ");
            int num = sc.nextInt();
            sc.nextLine();
            lista.setNumeroElementos(num);
    
            lista.agregarElementos();
            listas[i] = lista;
        }

        /*
            for (int i = 0; i < listas.length; i++) {
                System.out.println(listas[i].nombre);
        }
        */
        sc.close();
    }

    /* MÉTODOS DE LA LISTA */

    /* SETTEA EL NOMBRE */
/* AGREGAR CONDICIONAL POR SI EL USUARIO INGRESA UN VALOR VACÍO */

    public void setNombre(String nombre){
         this.nombre = nombre;
         System.out.println("El nombre de la lista es: " + this.nombre);
    }

    /* SETTEA EL NÚMERO DE ELEMENTOS */
    public void setNumeroElementos(int numeroElementos){  
        Scanner scNumeroElementos = new Scanner(System.in);

        /* INGRESAR CONDICIONAL SI EL USUARIO INGRESA UN VALOR QUE NO ES ENTERO */
        while(numeroElementos > maximoElementos numeroElementos || == 0){
            System.out.println("Número invalido, vuelve a ingresar un número entre 1 y 25");
            numeroElementos = scNumeroElementos.nextInt();
        }    

        this.elementos = new String[numeroElementos];
        System.out.println("El número de elementos de la lista es: " + elementos.length);
    }
    
    /* AGREGA ELEMENTOS A LA LISTA */
    public void agregarElementos(){
        Scanner scAgregarElementos = new Scanner(System.in);
        
        /* AGREGAR CONDICIONAL POR SI EL USUARIO INGRESA UN VALOR VACÍO */
        for (int i = 0; i < this.elementos.length; i++) {
            System.out.println("Agrega un elemento: ");
            this.elementos[i] = scAgregarElementos.nextLine();
        }
        
        System.out.println("Has llegado al límite de elementos, tu lista ha sido creada");
    }
}



/*      UNA LISTA TIENE ATRIBUTOS:
 * -Array de elementos
 * -Número de elementos
 * -Nombre de la lista
 * 
 *      UNA LISTA TIENE MÉTODOS PARA SETTEAR ATRIBUTOS:
 * -Settear nombre
 * -Settear número de elementos en el array
 * -Agregar elementos al array
 * 
 * 
 *      AGREGAR ELEMENTOS AL ARRAY
 * -Con un While agregamos elementos al array hasta que el número de iteraciones sea igual al número de elementos que contiene el array
 * -Hacer un if si el input del usuario esta vacío
 * 
 * 
 *      CREAR Y ACCEDER A NUEVAS LISTAS
 * -Un array que guarde nuevas listas
 * -Cada lista tiene un index dentro del array
 * -Diferenciar las listas por medio de la propiedad Nombre y lugar que ocupa en el array
 * -Opción para volver a crear otra lista
 * 
 * 
 *      RECAPITULANDO
 * 
 * -Las 4 opciones del menú: 
 * 
 * 1-Crear Lista:
 * -Manejo de errores con condicionales
 * -Creación del array de listas
 * 
 * 2.-Ver listas:
 * -submenú (switch):
 * -for loop: lista[i].nombre
 * -Elige lista por medio del nombre(string): condicionales o switch
 * -system.out.printin (¿quieres modificas listas?) si o no
 * 
 * 3.-Modificiar listas: despliega listas, cambiar lugar de elemento, borrar elemento o agregar elemento:
 * -System.out.println(¿Qué lista quieres modificar? teclea su nombre) condicionales o switch
 * -cambiar de lugar un elemento, actualizar nombre del elemento, borrar elemento o agregar un elemento.
 * 
 * 4.-Salir
 * 
  */




