
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
            scaner.nextLine();
            
            switch (option) { 
                case 1:
                     System.out.println("id:");
                     String id = scaner.nextLine();
                     System.out.println("nombre:");
                     String nombre = scaner.nextLine();
                     System.out.println("direccion:");
                     String dir = scaner.nextLine();
                     System.out.println("descripcion:");
                     String des = scaner.nextLine();
                     System.out.println("correo:");
                     String correo = scaner.nextLine();
                     System.out.println("telefono:");
                     String tel = scaner.nextLine();
                     System.out.println("contraseña:");
                     String contrasenia = scaner.nextLine();
                     String foto = "foto.jpg";
                     System.out.println("tipo de usuario 1(estudiante) - 2(empresa/institucion):");
                     int user = scaner.nextInt();
                     scaner.nextLine();
                     
                     if(user == 2){
                        
                         EmpresaInstitucion emp = new EmpresaInstitucion(id, nombre, dir, des, correo, tel, contrasenia, foto, user);
                         System.out.println("empresa "+emp.getNombre()+" creada");
                        
                    }
                    else{
                        System.out.println("Universidad:");
                        String uni = scaner.nextLine();
                        String cv = "cv.pdf";
                        Estudiante est = new Estudiante(id, nombre, dir, des, correo, tel, contrasenia, foto, user, uni, cv);
                        System.out.println("estudiante "+est.getNombre()+" creado");
                    }
                        
                break;
                    
                case 2:
                     System.out.println("Ingrese ID de la empresa:");
                     int idempresa = scaner.nextInt();
                     scaner.nextLine();
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
