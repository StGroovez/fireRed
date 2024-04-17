package Lista;
import java.util.Scanner;
public class Lista {
    /* ATRIBUTOS DE LA LISTA */

    String[] elementos = {};
    String nombre;
    int numeroElementos;
    static Scanner sc = new Scanner(System.in);

    
    public static void main(String[] args) {    

        /* CREAR LISTAS */

        Lista[] listas = new Lista[1];
        String name;
        int num = 0;
        int indexElemento;
        int indexElemento2;

        for (int i = 0; i < listas.length; i++) {
            System.out.println("Nombre de la lista: ");

            name = Lista.validarNombre();
            num = Lista.validacionElementos();

            listas[i] = new Lista(name,  num);
        }
        for (int i = 0; i < listas.length; i++) {
            listas[i].mostrarElementos();
        }


        /* MODIFICAR LISTAS */

        System.out.println("Ingresa el número de elemento que cambiaras de lugar");
        indexElemento = validacionNumero();
        System.out.println("Ingresa el número de lugar en que lugar lo quieres colocar");
        indexElemento2 = validacionNumero();

        listas[0].cambiarElementos(indexElemento, indexElemento2);
        for (int i = 0; i < listas.length; i++) {
            listas[i].mostrarElementos();
        }
        sc.close();
    }


    /* MÉTODOS DE LA LISTA */

    public void mostrarElementos() {
        System.out.println("Elementos de la lista " + nombre + ": ");
        for (int i = 0; i < elementos.length; i++) {
            System.out.println((i+1) + " " + elementos[i]);
        }    
    }

    /* SETTEA EL NOMBRE */
    public void setNombre(String nombre){
        this.nombre = nombre;
        System.out.println("El nombre de la lista es: " + this.nombre);
    }

    /* SETTEA EL NÚMERO DE ELEMENTOS */
    public void setNumeroElementos(int numeroElementos){  
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


    /* METODO CONSTRUCTOR */

    public Lista(String name, int numElements){
        setNombre(name);
        setNumeroElementos(numElements);
        agregarElementos();
    }

    /*validaciones */

    static String validarNombre(){
        String nombre = sc.nextLine();
        while (nombre == null || nombre.isEmpty()) {
            System.out.println("Ingresa un nombre válido");
            nombre = sc.nextLine();
        }
        return nombre;
    }

    static int validacionElementos(){ 
        int numValido;
        while (true) {
            System.out.println("Ingresa un número entre 1 y 25: ");
            if (sc.hasNextInt()) {
                numValido = sc.nextInt();
                sc.nextLine();
                if (numValido >= 1 && numValido <= 25) {
                    break;
                } else {
                    System.out.println("Número fuera del rango, vuelve a intentarlo.");
                }
            } else {
                System.out.println("Debes ingresar un número entero, vuelve a intentarlo: ");
                sc.next();
            }
        }
        return numValido;
    }

    static int validacionNumero(){
        int numero;
        while (true) {
            if(sc.hasNextInt()) {
                numero = sc.nextInt();
                sc.nextLine();
                break;
            }
            else{
                System.out.println("Debes ingresar un número entero, vuelve a intentarlo: ");
                sc.next();
            }
        }
        return numero;
    }

    /* MODIFICAR LISTAS */
    
    String[] cambiarElementos(int elementoBase, int elementoNuevo ){
        String saveElemento = elementos[elementoBase - 1];
        elementos[elementoBase - 1] = elementos[elementoNuevo - 1];
        elementos[elementoNuevo - 1] = saveElemento;
        return elementos;
    }

    String[] borrarElemento(String elementoBorrado){
        String[] newElementos = new String[elementos.length - 1];
        int j = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (!elementos[i].equalsIgnoreCase(elementoBorrado)) {
                newElementos[j] = elementos[i];
                j++;
            }
        }
        elementos = newElementos;
        System.out.println("Se borró el elemento: " + elementoBorrado + " de la lista.\nLa nueva lista contiene los siguientes elementos:");
        return newElementos;
    }
}




