
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class main
{
    public static void main(String[] args){
        
        Scanner scaner = new Scanner(System.in);
        
        boolean salir = false;
        int option;
        
        while (!salir){
        
            System.out.println("1. Crear usuario");
            System.out.println("2. Crear pasantia");
            System.out.println("3. Postular pasantia");
            System.out.println("4. Consultar pasantias");
            System.out.println("5. Consultar postulaciones");
            System.out.println("6. Salir");
            
            System.out.println("hola, por favor ingresa la opcion que desees");
            option = scaner.nextInt();
            
            switch (option) { 
                case 1:
                     System.out.println("nombre:");
                     String nombre = scaner.nextLine();
                    break;
                case 2:
                     
                    break;
                case 3:
                    
                    break;
                case 4:
                     
                    break;
                case 5:
                     
                    break;
                case 6:
                     salir = true;
                    break;
        
        
        
            }
        }
    
    
    }
}
