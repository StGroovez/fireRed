import java.util.Scanner;
public class Lista {
    /* ATRIBUTOS DE LA LISTA */

    String[] elementos = {};
    String nombre;
    int numeroElementos;
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {    

        Scanner sc = new Scanner(System.in);
        Lista[] listas = new Lista[3];
        String name;
        int num;

        for (int i = 0; i < listas.length; i++) {
            Lista lista = new Lista();

            System.out.println("Nombre de la lista: ");
            name = sc.nextLine();
            lista.setNombre(name);
            
            System.out.println("Ingresa un número entre 1 y 25 ");
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
        sc.close();
        
        for (int i = 0; i < listas.length; i++) {
            listas[i].mostrarElementos();
        }
    }

    /* MÉTODOS DE LA LISTA */


    public void mostrarElementos() {
        System.out.println("Elementos de la lista " + nombre + ": ");
        for (String elemento : elementos) {
            System.out.println(elemento);
        }
    }

    /* SETTEA EL NOMBRE */
    public void setNombre(String nombre){
        
        while (nombre == null || nombre.isEmpty()) {
            System.out.println("Ingresa un nombre válido");
            nombre = sc.nextLine();
        }
        this.nombre = nombre;
        System.out.println("El nombre de la lista es: " + this.nombre);
    }

    /* SETTEA EL NÚMERO DE ELEMENTOS */
    public void setNumeroElementos(int numeroElementos){  

        /* INGRESAR CONDICIONAL SI EL USUARIO INGRESA UN VALOR QUE NO ES ENTERO */
        while(numeroElementos  == 0){
            System.out.println("Número invalido, vuelve a ingresar un número entre 1 y 25");
            numeroElementos = sc.nextInt();
        }    

        this.elementos = new String[numeroElementos];
        System.out.println("El número de elementos de la lista es: " + elementos.length);

    }
    
    /* AGREGA ELEMENTOS A LA LISTA */
    public void agregarElementos(){

        for (int i = 0; i < this.elementos.length; i++) {     
            System.out.println("Agrega un elemento: ");
            this.elementos[i] = sc.nextLine();
            
            while(this.elementos[i].isEmpty() || this.elementos[i] == null) {
                System.out.println("No puedes agregar un elemento vacío a la lista. Vuelve a ingresar un elemento:");
                this.elementos[i] = sc.nextLine();
            } 
        }
        System.out.println("Has llegado al límite de elementos, tu lista ha sido creada");
    }

    String getNombre(){
        return nombre;
    }
}
  */




