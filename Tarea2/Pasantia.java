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
    private EmpresaInstitucion empresainstitucion;
    private ArrayList<Postulacion> postulaciones;

    /**
     * Constructor for objects of class Pasantía
     */
    public Pasantia(){
        this.cargo = cargo;
        this.descripcion = descripcion;
        empresainstitucion = new EmpresaInstitucion();
        postulaciones = new ArrayList<Postulacion>();
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
