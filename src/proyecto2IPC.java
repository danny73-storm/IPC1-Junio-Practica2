package src;

import java.util.Scanner;


public class proyecto2IPC{
    
    
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
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
          
           
           opcion = sn.nextInt();
           switch(opcion){
               case 1:
                   System.out.println("Has seleccionado la opcion 1");
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2");
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3");
                   break;
                case 4:
                   System.out.println("Has seleccionado la opcion 4");
                   break;
                case 5:
                   System.out.println("Has seleccionado la opcion 5");
                   break;
                case 6:
                   System.out.println("Has seleccionado la opcion 6");
                   break;
                case 7:
                   System.out.println("Has seleccionado la opcion 7");
                   break;
                case 8:
                   System.out.println("Has seleccionado la opcion 8");
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