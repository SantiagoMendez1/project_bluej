import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 * Write a description of class Postulación here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Postulacion
{
    private String pasantia;
    private String aspirante;
    private LocalDateTime fechaPostulacion;
    private String estado;
    //private ArrayList<Estudiante> estudiantes;

    /**
     * Constructor for objects of class Postulación
     */
    public Postulacion(String pasantia, String aspirante, LocalDateTime fechaPostulacion, String estado)
    {
        // initialise instance variables
        this.pasantia = pasantia;
        this.aspirante = aspirante;
        this.fechaPostulacion = fechaPostulacion;
        this.estado = estado;
    }
    
    public String getPasantia()
    {
        return pasantia;
    }
    
    public String getAspirante(){
        return aspirante;
    }
    
    public LocalDateTime getFechaPostulacion(){
        return fechaPostulacion;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado  = estado;
    }
}
