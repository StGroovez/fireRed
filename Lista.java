package Lista;
import java.util.Scanner;

public class Lista {
    /* ATRIBUTOS DE LA LISTA */

    String[] elementos = {};
    String nombre;
    int numeroElementos;
    public static void main(String[] args) {
        
        
        Lista[] listas ={};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de la lista: ");
        String name = sc.nextLine();
        System.out.println("Número de elementos: ");
        int num = sc.nextInt();

        Lista.instanciarLista(name, num);

        sc.close();
    }

    /* MÉTODOS DE LA LISTA */

    /* SETTEA EL NOMBRE */
    public void setNombre(String nombre){
         this.nombre = nombre;
         System.out.println("El nombre de la lista es: " + this.nombre);
    }


    /* SETTEA EL NÚMERO DE ELEMENTOS */
    public void setElementos(int numeroElementos){      
        this.elementos = new String[numeroElementos];
        System.out.println("El número de elementos de la lista es: " + elementos.length);
    }
    
    
    /* MÉTODO CONSTRUCTOR */
    public static Lista instanciarLista(String nombre, int numeroElementos){
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();
        int i = 0;
        lista.setNombre(nombre);
        lista.setElementos(numeroElementos);
            
        while(i < lista.elementos.length){
            System.out.println("Agrega un elemento: ");
            lista.elementos[i] = sc.nextLine();
            System.out.println(lista.elementos.length);
            
        /*      COMPROBACIÓN DE QUE GUARDA LOS ELEMENTOS
           
            for (int ia = 0; ia < lista.elementos.length; ia++) {
                System.out.println(lista.elementos[ia]);
            } 
        */ 
            i++;
        }
        System.out.println("Has llegado al límite de elementos, tu lista ha sido creada");
        sc.close();
        return lista;
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
 * 
 * 
 *      CREAR Y ACCEDER A NUEVAS LISTAS
 * -Un array que guarde nuevas listas
 * -Cada lista tiene un index dentro del array
 * -Diferenciar las listas por medio de la propiedad Nombre y lugar que ocupa en el array
 * 
  */




