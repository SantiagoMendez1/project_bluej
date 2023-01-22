import java.util.ArrayList; 
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
    private String nombre;
    private String universidad;
    private String curriculum;
    private ArrayList<Postulacion> postulaciones;
    private ArrayList<Pasantia> pasantias;


    /**
     * Constructor for objects of class Estudiante
     */
    public Estudiante(String nombre, String universidad, String curriculum)
    {
        this.universidad = universidad;
        this.curriculum = curriculum;
        this.nombre = nombre;
        postulaciones = new ArrayList<Postulacion>();
        pasantias = new ArrayList<Pasantia>();
    }
    
    public String getNombreEstudiante(){
        return nombre;
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
        System.out.print(postulaciones.get(1));
        return true;
    }
/*  
    public int getNumeroDePostulaciones(){
        
    }
    
    public ArrayList<Pasantia> buscarPasantia(){
        
    }
    
    public boolean cancelarPostulacion(){
        
    }
    */
}
