import java.util.Scanner;
import java.util.Arrays;

public class verLista {

    private int elements; //numero de items de la lista creada por el usuario
    private String name; //nombre de la lista creada por el usuario
    private Scanner scanner;
    private Object[][] listOfLists; //lista que guarda las listas creadas por el usuario
	private String[] listNames = new String[0]; //lista de los nombres
	//private String[] listNames; 
	private static int numberOfLists = 0; //numero de listas creadas por el usuario
	
    public verLista() {
        this.scanner = new Scanner(System.in);
        this.numberOfLists = 0;
    }

    public void parametros() {
        System.out.println("Crearemos una nueva lista. ");

        System.out.print("Ingrese el nombre de la lista: ");
        this.name = scanner.nextLine();

        System.out.println("Ingrese el número de elementos para la lista: ");
            while(true){
                if (scanner.hasNextInt()) {
                    this.elements = scanner.nextInt();
                    scanner.nextLine();
                    break;
                }
                else{
                    System.out.println("Ingrese un número entero: ");
                    scanner.next();
                }
            }
        
        /*System.out.print("Ingrese el número de elementos para la lista: ");
        this.elements = scanner.nextInt();
        scanner.nextLine();*/
		
		crearNombre();
    }

    /* sett number of elements 
    public void setNumeroElementos(int elements){  

        /* warning to incorrect values 
        while(this.elements  == 0){
            System.out.println("Número invalido");
            this.elements = scanner.nextInt();
        }    

        System.out.println("El número de elementos de la lista es: " + elements);

    } */

//metodo para almacenar el nombre de las listas
 	 
     public void crearNombre() {
        if (listNames == null) {
            listNames = new String[1];
            listNames[0] = name;
        } else {
            String[]temp = Arrays.copyOf(listNames, listNames.length + 1);
            temp[temp.length - 1] = name;
            listNames = temp;
        }
        
    } 
	
//metodo para que el usuario cree una lista
    public Object[] crearLista() {
        Object[] lista = new String[elements];//aqui se crean la lista del usuario
	
        for (int i = 0; i < elements; i++) {
            System.out.print("Ingrese el elemento para la posición " + (i + 1) + " de la lista: ");
            lista[i] = scanner.nextLine(); //aqui se van llenando las listas
        }
        return lista;
    }

    public void agregarLista(Object[] nuevaLista) {
        
		if (listOfLists == null) {
            listOfLists = new Object[1][];
            listOfLists[0] = nuevaLista;
        } else {
            Object[][] temp = Arrays.copyOf(listOfLists, listOfLists.length + 1);
            temp[temp.length - 1] = nuevaLista;
            listOfLists = temp;
        }
        numberOfLists++;
    }
	
	public void mostrarListas() {
        if (listOfLists != null && numberOfLists > 0) {
            for (int i = 0; i < numberOfLists-1; i++) {
                System.out.println("Lista " + (i + 1)+" "+ listNames[i]+" :");
                for (Object elemento : listOfLists[i]) {
                    System.out.print(elemento + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No hay listas creadas aún."+numberOfLists);
        }
		
	 System.out.println(Arrays.deepToString(listOfLists));
    }
	
	
		
	
}
