import java.util.Scanner;
import java.util.Arrays;
public class ModificarListas{
	///
	Scanner scanner = new Scanner(System.in);
	Scanner scanner2 = new Scanner(System.in);
	
	    //variables de instancia
	    //lista general donde se encuentran todas las listas
		public String[][] listasGeneral =  {{"6","7","5","0","4"}, {"3", "8", "4"}, {"1","0","2","7"}, {"9","5"}};;
		//que lista modificaremos
		private int lista1, opcion;
		//que elemento
		int elemento;
		//posicion de la lista
		int elementoLugar;
		//nuevo nombre de la lista
		
		String[] prueba;
		String[] prueba1;
		String elementoNombre="lista 1";
		
		
		//metodo mostrar listas
		void mostrarListas(){
		
		//mostrar listas guardadas listasGeneral
		
		System.out.println("\n");
		for(int i=0; listasGeneral.length > i; i++){
			System.out.println("Lista "+(i+1));
		}
		
		System.out.println("--------Que lista modificaremos?-------");
		//scaner....
		lista1 = scanner.nextInt();
		//lo que escaneo igualar con for para encontrar la lista
		//mostrar la lista
		System.out.println("\n Lista "+ lista1);
		
		for(int i=0; listasGeneral[lista1-1].length > i; i++){
			
			System.out.println("Valor "+ (i+1)+ "= "+ listasGeneral[lista1-1][i]);
		
		
		}
		//preguntar cambiar lugar, actualizar nombre de elemento, borrar elemento, agregar elemento
		//dependiendo lo que quiera se llama al metodo
		while (true) {
            System.out.println("\n Hola, Elija la operación que desea realizar:");
            System.out.println("1. Cambiar lugar de elemento");
            System.out.println("2. Actualizar nombre de elemento");
            System.out.println("3. Borrar elemento");
            System.out.println("4. Agregar elemento");
			System.out.println("5. Regresar a menu principal");
    
            int opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println("Saliendo de modificar lista.");
                break;
            }

            switch (opcion) {
                case 1:
                    cambiarLugar(listasGeneral, lista1);
                    break;
                case 2:
                    actualizarElemento(listasGeneral, lista1);
                    break;
                case 3:
                    borrarElemento(listasGeneral, lista1);
                    break;
				case 4:
                    agrergarElemento(listasGeneral, lista1);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una acción válida.");
                    continue;
            }

            System.out.print("¿Desea realizar otra acción? (Si/No): ");
            String respuesta = scanner.next().toLowerCase();

            if (respuesta=="no") {
                System.out.println("Saliendo del programa. ¡Hasta luego, !");
                break;
				
            }else {
				continue;
			}
        }
		
		}
		//metodo cambiar lugar
		String[] cambiarLugar(String[][] listaGeneral, int opcion){

			System.out.println("\n Que valor desea cambiar de lugar?");
			int opcion2 = scanner.nextInt();
			
			System.out.println("\n Por cual valor se deberia de cambiar?");
			int opcion3 = scanner.nextInt();
			
			String a=listaGeneral[lista1-1][opcion2-1]; /// el que se va a cambiar
			String b=listaGeneral[lista1-1][opcion3-1]; //nuevo valor
			
			System.out.println("\n Nueva Lista");
			
			for(int i=0; listaGeneral[lista1-1].length > i; i++){
				if(listaGeneral[lista1-1][i]==listaGeneral[lista1-1][opcion2-1]){
					listaGeneral[lista1-1][opcion2-1]=b;
				}
				if(listaGeneral[lista1-1][i]==listaGeneral[lista1-1][opcion3-1]){
					listaGeneral[lista1-1][opcion3-1]=a;
				}
				System.out.println("Valor "+ (i+1)+ "= "+ listasGeneral[lista1-1][i]);
			} 
			
			return listaGeneral[lista1-1];
		}
		
		//metodo actualizar nombre
		String[] actualizarElemento(String[][] listaGeneral, int opcion){
			
			System.out.println("\n Que valor desea actualizar?");
			int opcion2 = scanner.nextInt();
			
			System.out.println("\n Cual seria el nuevo nombre?");
			String opcion4 = scanner2.nextLine();
			
			String a=opcion4; /// el que se va a cambiar string
			
			
			System.out.println("\n Nueva Lista");
			
			for(int i=0; listaGeneral[lista1-1].length > i; i++){
				if(listaGeneral[lista1-1][i]==listaGeneral[lista1-1][opcion2-1]){
					listaGeneral[lista1-1][opcion2-1]=a;
				}
				
				System.out.println("Valor "+ (i+1)+ "= "+ listasGeneral[lista1-1][i]);
			} 
			
			return listaGeneral[lista1-1];
		}
		
		///metodo borrar elemento
		String[] borrarElemento(String[][] listaGeneral, int opcion){
			
			System.out.println("\n Que valor desea borrar?");
			int opcion5 = scanner.nextInt();
			
		//instanciamos nueva matris para almacenar y ordenar nuevos valores
			String [][] listaGeneral1 = new String [listaGeneral.length][listaGeneral[lista1-1].length-1];
			
			//for para encontrar el valor a eliminar
			for(int i=0; listaGeneral[lista1-1].length > i; i++){
				if(i==(opcion5-1)){
					//ina vez dentro del dato a eliminar recorremos cada valor hasta la posicion exacta y cuando esta sea diferente
					//igualamos si no seguimos adelante
					int j, h=0;
					
					for(j=0; j<listaGeneral[lista1-1].length; j++){
						
						if(j!=i){
							listaGeneral1[lista1-1][h]=listaGeneral[lista1-1][j];
						//mostramos nueva lista con dato borrado
							System.out.println("valor " + (1+h) + "= " +listaGeneral1[lista1-1][h]); 
							h++;
						}
					}
				   
				    
				 
				}
			
			
			}
			listaGeneral[lista1-1]=listaGeneral1[lista1-1];
		return listaGeneral[lista1-1];
		}
		
		
		// metodo agregar elemento
		String[] agrergarElemento(String[][] listaGeneral, int opcion){
			
			System.out.println("\n Cual seria el nuevo elemento de la lista?");
			String nuevoValor = scanner2.nextLine();
			
			String [][] listaGeneral1 = new String [listaGeneral.length][listaGeneral[lista1-1].length+1];
			
			for(int i=0; listaGeneral1[lista1-1].length > i; i++){
			if(listaGeneral[lista1-1].length > i){
				   
			   listaGeneral1[lista1-1][i]=listaGeneral[lista1-1][i];
				   
			   }else {
				listaGeneral1[lista1-1][i]=nuevoValor;
				}
			System.out.println("Valor " + (i+1) + "= " + listaGeneral1[lista1-1][i]);
				 
			}
			
			listaGeneral[lista1-1]=listaGeneral1[lista1-1];
			return listaGeneral[lista1-1];
		}
}

	