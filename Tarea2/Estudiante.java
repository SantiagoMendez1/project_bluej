import java.util.ArrayList;
import java.util.List; 
import java.util.Collections;
import java.lang.*;
import java.util.stream.Collectors;  
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
/**
 * Write a description of class Estudiante here.
 * 
 * @author (Henry Mantilla, Santiago Mendez) 
 * @version (1.0)
 */
public class Estudiante extends Usuario
{
    private String universidad;
    private String curriculum;
    private ArrayList<Postulacion> postulaciones;
    private ArrayList<Pasantia> pasantias;


    /**
     * Constructor for objects of class Estudiante
     */
    public Estudiante(String id, String nombre, String direccion, String descripcion, String correo, String telefono, String contrasenia, String foto,
    int tipoUsuario, String universidad, String curriculum)
    {
        super(id, nombre, direccion, descripcion, correo, telefono, contrasenia, foto, tipoUsuario);
        this.universidad = universidad;
        this.curriculum = curriculum;
        postulaciones = new ArrayList<Postulacion>();
        pasantias = new ArrayList<Pasantia>();
    }

    public String getUniversidad(){
       return universidad;
    }
    
    public String getCurriculum(){
        return curriculum;
    }
    
    public boolean realizarPostulacion(String pasantia, String aspirante){
        
        LocalDateTime fecha = java.time.LocalDateTime.now();
        postulaciones.add(new Postulacion(pasantia, aspirante, fecha, "enviado"));
        //System.out.print(postulaciones.get(1));
        return true;
    }
  
    public int getNumeroDePostulaciones(){
        return postulaciones.size();
    }
    
    public ArrayList<Pasantia> buscarPasantia(String palabraClave){ 
        ArrayList<Pasantia> resultadosBusqueda = new ArrayList<Pasantia>();
        for(Pasantia p : resultadosBusqueda){
            if(p.getCargo() != null && p.getCargo().contains(palabraClave)){
               resultadosBusqueda.add(p); 
            } 
            else if(p.getDescripcion() != null & p.getDescripcion().contains(palabraClave)){
                resultadosBusqueda.add(p);
            }
        }
        return resultadosBusqueda;
    }
    
    public boolean cancelarPostulacion(String pasantia){
        postulaciones.remove(pasantia);
        return true;
    }
    
}
