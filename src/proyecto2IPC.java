package src;

import java.util.Scanner;


public class proyecto2IPC{
    
    
    public static void main(String[] args) {

    	proyecto2IPC alpha = new proyecto2IPC();
       
    } 

    public proyecto2IPC(){

       Scanner leer = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del cliente
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
                   break;
                case 4:
                   System.out.println("\nIngresar nueva peli");
                   System.out.println("-------------------\n");
                   break;
                case 5:
                   System.out.println("\nOrden ascendenete respecto al nombre");
                   System.out.println("------------------------------------\n");
                   break;
                case 6:
                   System.out.println("\nIngreso de cliente");
                   System.out.println("------------------\n");
                   break;
                case 7:
                   System.out.println("\nMostrar clientes");
                   System.out.println("----------------\n");
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
}