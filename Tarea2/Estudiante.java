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
    private ArrayList<Pasantia> resultadosBusqueda;


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
        resultadosBusqueda= new ArrayList<Pasantia>();
    }

    public String getUniversidad(){
       return universidad;
    }
    
    public String getCurriculum(){
        return curriculum;
    }
    
    public boolean realizarPostulacion(String pasantia, String aspirante){
        //postulaciones = new ArrayList<Postulacion>();
        LocalDateTime fecha = java.time.LocalDateTime.now();
        postulaciones.add(new Postulacion(pasantia, aspirante, fecha, "enviado"));
        
        return true;
    }
  
    public int getNumeroDePostulaciones(){
        return postulaciones.size();
    }
    
    public ArrayList<String> buscarPasantia(String palabraClave, ArrayList<Pasantia> resultadosBusqueda){ 
        ArrayList<String> resultadosBusquedaFinal = new ArrayList<String>();
        for(Pasantia p : resultadosBusqueda){
            if(p.getCargo() != null && p.getCargo().contains(palabraClave)){
               resultadosBusquedaFinal.add(p.getCargo()); 
            } 
            else if(p.getDescripcion() != null & p.getDescripcion().contains(palabraClave)){
                resultadosBusquedaFinal.add(p.getCargo());
            }
        }
        
        return resultadosBusquedaFinal;
    }
    
    public int cancelarPostulacion(int indexPasantia){
        postulaciones.remove(indexPasantia);
        return postulaciones.size();
    }
    
}
