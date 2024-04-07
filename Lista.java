package Lista;
import java.util.Scanner;

public class Lista {
    /* ATRIBUTOS DE LA LISTA */

    String[] elementos = {};
    String nombre;
    int numeroElementos;
    public static void main(String[] args) {
        
        Lista lista = new Lista();
        Lista[] listas ={};
        String name;
        Int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de la lista: ");
        name = sc.nextLine();
        lista.setNombre(name);
        System.out.println("Número de elementos: ");
        num = sc.nextInt();
        lista.setElementos(num);

        lista.agregarElementos();

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
    
    
    /* INSTANCIAR LISTA */
    public void agregarElementos(){
        Scanner sc = new Scanner(System.in);
        int i = 0;  
        while(i < this.elementos.length){
            System.out.println("Agrega un elemento: ");
            this.elementos[i] = sc.nextLine();
            System.out.println(this.elementos.length);
            
        /*      COMPROBACIÓN DE QUE GUARDA LOS ELEMENTOS
           
            for (int ia = 0; ia < this.elementos.length; ia++) {
                System.out.println(this.elementos[ia]);
            } 
        */ 
            i++;
        }
        System.out.println("Has llegado al límite de elementos, tu lista ha sido creada");
        sc.close();
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
  */




