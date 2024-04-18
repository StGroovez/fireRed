import java.util.Scanner;

public class Lista {
    /*    ATRIBUTOS DE LA LISTA    */
    String[] elementos = {};
    protected String nombre;
    protected int numeroElementos;
    static Scanner sc = new Scanner(System.in);

    /*    MÉTODOS DE LA LISTA    */
    public void mostrarElementos() {    
        for (int i = 0; i < elementos.length; i++) {
            System.out.println((i+1) + " " + getElementos()[i]);
        }    
    }
    /*    SETTEA EL NOMBRE    */
    public void setNombre(String nombre){
        this.nombre = nombre;
        System.out.println("El nombre de la lista es: " + this.nombre);
    }
    /*    SETTEA EL NÚMERO DE ELEMENTOS    */
    public void setNumeroElementos(int numeroElementos){  
        this.elementos = new String[numeroElementos];
        System.out.println("El número de elementos de la lista es: " + elementos.length);
    }    
    /*    AGREGA ELEMENTOS A LA LISTA    */
    public void agregarElementos(){
        for (int i = 0; i < elementos.length; i++) {     
            System.out.println("Agrega un elemento: ");
            this.elementos[i] = sc.nextLine();
            
            while(this.elementos[i].isEmpty() || elementos[i] == null) {
                System.out.println("No puedes agregar un elemento vacío a la lista. Vuelve a ingresar un elemento:");
                this.elementos[i] = sc.nextLine();
            } 
        }
        System.out.println("Has llegado al límite de elementos, tu lista ha sido creada");
    }
    /*    MÉTODO CONSTRUCTOR     */
    public Lista(String name, int numElements){
        setNombre(name);
        setNumeroElementos(numElements);
        agregarElementos();
    }

    /*    VALIDACIONES     */
    static String validarNombre(){
        String nombre = sc.nextLine();
        while (nombre == null || nombre.isEmpty()) {
            System.out.println("Ingresa un nombre válido");
            nombre = sc.nextLine();
        }
        return nombre;
    }

    String validarElemento(){
        String elementoBorrar = sc.nextLine();
        while (elementoBorrar == null || elementoBorrar.isEmpty()) {
            System.out.println("Ingresa un elemento válido");
            elementoBorrar = sc.nextLine();
        }

        for (int i = 0; i < elementos.length; i++) { 
            while(!elementoBorrar.equalsIgnoreCase(elementos[i])){
                System.out.println("Ingresa un elemento existente");
                elementoBorrar = sc.nextLine();
            }
        }
        return elementoBorrar;
    }

    static int validacionElementos(){ 
        int numValido;
        while (true) {
            System.out.println("Ingresa el número de elementos para la lista: ");
            if (sc.hasNextInt()) {
                numValido = sc.nextInt();
                sc.nextLine();
                if (numValido > 0) {
                    break;
                } else {
                    System.out.println("Número inválido. Ingresa un número mayor a 0.");
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
    public String[] getElementos() {
        return this.elementos;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    String[] cambiarElementos(int elementoBase, int elementoNuevo ){
        String saveElemento = elementos[elementoBase - 1];
        elementos[elementoBase - 1] = elementos[elementoNuevo - 1];
        elementos[elementoNuevo - 1] = saveElemento;
        System.out.println("Los elementos han sido intercambiados.");
        mostrarElementos();
        return elementos;
    }

    String[] borrarElemento(int indiceBorrar) {
        while (indiceBorrar < 1 || indiceBorrar > elementos.length) {
            System.out.println("El índice no existe. Ingresa un índice válido: ");
            indiceBorrar = Lista.validacionNumero();
        }
        String[] newElementos = new String[elementos.length - 1];
        int j = 0;
    
        for (int i = 0; i < elementos.length; i++) {
            if (i != indiceBorrar - 1) {
                newElementos[j] = elementos[i];
                j++;
            }
        }
        elementos = newElementos;
    
        System.out.println("Se borró el elemento en la posición " + indiceBorrar + " de la lista.\nLa nueva lista contiene los siguientes elementos:");
        mostrarElementos();
        return newElementos;
    }
    
    String[] agregarElemento(String elementoAgregado){
        String[] newElementos = new String[elementos.length + 1];
        for (int i = 0; i < elementos.length; i++) {
            newElementos[i] = elementos[i];
        }
        newElementos[elementos.length] = elementoAgregado;
        elementos = newElementos;
        System.out.println("Se agregó el elemento: " + elementoAgregado + " a la lista.\nLa nueva lista contiene los siguientes elementos:");
        mostrarElementos();
        return newElementos;
    }

    String[] modificarElemento(int indiceElemento, String cambioElemento) {       
        if (indiceElemento >= 1 && indiceElemento <= elementos.length) {
            elementos[indiceElemento - 1] = cambioElemento;
            System.out.println("El elemento en la posición " + indiceElemento + " ha sido modificado correctamente.");
        } else {
            System.out.println("Índice fuera de rango. No se puede modificar el elemento.");
        }
        System.out.println("Lista modificada:");
        mostrarElementos();
        return elementos;
    }
}
