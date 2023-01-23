import java.util.ArrayList;
/**
 * Write a description of class Pasantía here.
 * 
 * @author (Henry Mantilla, Santigo Mendez) 
 * @version (a version number or a date)
 */
public class Pasantia
{
    // instance variables - replace the example below with your own
    private String cargo;
    private String descripcion;
    private String empresainstitucion;
    private ArrayList<Postulacion> postulaciones;

    /**
     * Constructor for objects of class Pasantía
     */
    public Pasantia(String cargo, String descripcion, String empresainstitucion){
        this.cargo = cargo;
        this.descripcion = descripcion;
        this.empresainstitucion = empresainstitucion;
    }

    public int getNumeroDePostulaciones(){
        return postulaciones.size();
    }
    
        public String getCargo(){
        return cargo;
    }
    
        public String getDescripcion(){
        return descripcion;
    }
    
    
}
