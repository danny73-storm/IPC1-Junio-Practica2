package src;

import java.util.Scanner;

public class proyecto2IPC{
   
    
   public static void main(String[] args) {     
      proyecto2IPC alpha = new proyecto2IPC();        
   }
   Scanner leer = new Scanner(System.in);
    
   public proyecto2IPC(){ 
      Scanner leer = new Scanner(System.in);
      // creando los arraya o matrices.
      int[] identificador = new int[15];
      String[] nombre = new String[15];
      int[] telefono = new int[15];
      boolean[] tienePeliPres = new boolean[15];
      int[] año = new int[15];
      String[] nombrePeli = new String[15];
      String[] categoria = new String[15];
       
      //iniciando el menu 
      boolean salir = false;
      int opcion; //Guardaremos la opcion del cliente.
      while(!salir){
         System.out.println("\n******************************");
         System.out.println("*******  Bienvenidos a  ******");
         System.out.println("*******   Memorabilia   ******");
         System.out.println("******************************\n\n");
         System.out.println("----------------------------");
         System.out.println(" Ingrese opcion que desee:  ");
         System.out.println("----------------------------");
         System.out.println("1. Prestamo de peliculas");
         System.out.println("2. Devolucion de peliculas");
         System.out.println("3. Mostrar peliculas");
         System.out.println("4. Ingreso de peliculas");
         System.out.println("5. Ordenar las películas de forma ascendente respecto al nombre");
         System.out.println("6. Ingresar clientes nuevos");
         System.out.println("7. Mostrar clientes");
         System.out.println("8. Reportes");
         System.out.println("9. Salir");
          
         opcion = leer.nextInt();
         switch(opcion){
            case 1:
               System.out.println("\nQue pelicula deseas prestar?");
               System.out.println("----------------------------\n");
               break;
            case 2:
               System.out.println("\nQue pelicula deseas devolver?");
               System.out.println("-----------------------------\n");
               break;
            case 3:
               System.out.println("\nCatalogo de pelis!");
               System.out.println("------------------\n");
               imprimirPeli(año,nombrePeli,categoria,15);
               break;
            case 4:
               System.out.println("\nIngresar nueva peli");
               System.out.println("-------------------\n");
               insertarPeli(año,nombrePeli,categoria,15);
               break;
            case 5:
               System.out.println("\nOrden ascendenete respecto al nombre");
               System.out.println("------------------------------------\n");
               break;
            case 6:
               System.out.println("\nIngreso de cliente");
               System.out.println("------------------\n");
               insertarClientes(identificador,nombre,telefono,tienePeliPres,15);                  
               break;
            case 7:
               System.out.println("\nMostrar clientes");
               System.out.println("----------------\n");
               imprimirClientes(identificador,nombre,telefono,tienePeliPres,15);
               break;
            case 8:
               System.out.println("\nReportes");
               System.out.println("--------\n");
               break;
               case 9:
            salir=true;
               break;
            default:
               System.out.println("Las opciones son entre 1 y 9 ");
            }
            
      }      
   }

   public void insertarClientes(int[] identificador , String[] nombre , int[] telefono, boolean[] tienePeliPres, int cantClientes){
      for (int i = 0; i<cantClientes; i++){
         boolean noValido = true;

         do{
            System.out.print("\n\nIngrese el ID del cliente" + (i+1) + ": ");
            identificador[i]= leer.nextInt();
            System.out.print("\n\nIngrese el nombre del cliente" + (i+1) + ": ");
            nombre[i]= leer.nextLine();
            System.out.print("\n\nIngrese el telefono del cliente" + (i+1) + ": ");
            telefono[i]= leer.nextInt();
            System.out.println("\n\nA alquilado peliculas");
            tienePeliPres[i] =leer.hasNext();
            leer.nextLine();        
         }while(noValido);

         System.out.println("\n\n");
      }
      System.out.println("\n\n");
   }   

   public void imprimirClientes(int[] identificador , String[] nombre , int[] telefono, boolean[] tienePeliPres, int cantClientes){

      for( int i =0; i<cantClientes;i++){
         System.out.println("ID: "+ identificador[i]+", nombre: "+ nombre[i]+", telefono: "+ telefono[i]+" Tiene peliculas alquiladas: "+tienePeliPres);
      }
   } 

   public void insertarPeli(int[] año, String[] nombrePeli,String[] categoria,int cantPelis){
       

      for (int i = 0; i<cantPelis; i++){
         boolean noValido = true;

         do{
            System.out.print("\n\nIngrese el año de la peli" + (i+1) + ": ");
            año[i]= leer.nextInt();
            System.out.print("\n\nIngrese el nombre de la pelicula" + (i+1) + ": ");
            nombrePeli[i]= leer.nextLine();
            System.out.print("\n\nIngrese la categoria de la pelicula" + (i+1) + ": ");
            categoria[i]= leer.nextLine();
            leer.nextLine();
         }while(noValido);
      }
     System.out.println("\n\n");
   }

   public void imprimirPeli( int[] año, String[] nombrePeli,String[] categoria,int cantPelis ){
      
      for( int i =0; i<cantPelis;i++){
         System.out.println("año: "+ año[i]+", nombre: "+ nombrePeli[i]+", categoria: "+ categoria[i]);
      }
   }                  
}