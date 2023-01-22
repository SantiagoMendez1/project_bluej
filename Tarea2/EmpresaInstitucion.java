
/**
 * Write a description of class EmpresaInstitución here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class EmpresaInstitucion extends Usuario
{
    // instance variables - replace the example below with your own
    private String webpage;

    /**
     * Constructor for objects of class EmpresaInstitución
     */
    public EmpresaInstitucion(String id, String nombre, String direccion, String descripcion, String correo, String telefono, String contrasenia, String foto,
    int tipoUsuario)
    {
        super(id, nombre, direccion, descripcion, correo, telefono, contrasenia, foto, tipoUsuario);
        this.webpage = webpage;
    }

    public String getWebpage()
    {
        // put your code here
        return webpage;
    }
    

    /*
     * 
     *public String CrearPasantia(String id){
        
        if (id == this.getId() && this.getTipoUsuario()==2){
            Scanner scaner = new Scanner(System.in);
            System.out.println("nombre:");
            String cargo = scaner.nextLine();
            System.out.println("direccion:");
            String des = scaner.nextLine();
            Pasantia pasantia = new Pasantia(cargo, des, this);
            return "empresa creada";
        }else{
            return "empresa con id "+ id+ "no encontrada";
        }
        
        
    }*/
}
