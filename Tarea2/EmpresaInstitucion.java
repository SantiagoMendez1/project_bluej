import java.util.ArrayList;
/**
 * Write a description of class EmpresaInstitución here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class EmpresaInstitucion extends Usuario
{
    // instance variables - replace the example below with your own
    private String webpage;
    private ArrayList<Pasantia> pasantias;
    private ArrayList<Postulacion> postulacionesRecibidas;

    /**
     * Constructor for objects of class EmpresaInstitución
     */
    public EmpresaInstitucion(String id, String nombre, String direccion, String descripcion, String correo, String telefono, String contrasenia, String foto,
    int tipoUsuario)
    {
        super(id, nombre, direccion, descripcion, correo, telefono, contrasenia, foto, tipoUsuario);
        this.webpage = webpage;
        
        pasantias = new ArrayList<Pasantia>();
        postulacionesRecibidas = new ArrayList<Postulacion>();
    }

    public String getWebpage()
    {
        return webpage;
    }
    
    public boolean crearPasantia(String cargo, String descripcion, String empresaInstitucion){
        
        boolean boolean_value = false;
        pasantias.add(new Pasantia(cargo, descripcion, empresaInstitucion));
        boolean_value = true;
        
        return boolean_value;
    }
    
    public int eliminarPasantia(int indexPasantiaEliminar){   
        pasantias.remove(indexPasantiaEliminar);
        return pasantias.size();
    }
    
    public boolean actualizarPasantia(int indexActualizar, String cargo, String descripcion, String empresaInstitucion){
        if(indexActualizar >= 0){
            pasantias.set(indexActualizar, new Pasantia(cargo, descripcion, empresaInstitucion));
            return true;
        }
        else{
            return false;
        }
    }
    
    public int contarPostulaciones(String pasantia, ArrayList<Postulacion> postulacionesRecibidas){
        ArrayList<Postulacion> postulacionesCount = new ArrayList<Postulacion>();
        for(Postulacion p : postulacionesRecibidas){
            if(p.getPasantia() != null && p.getPasantia().contains(pasantia)){
               postulacionesCount.add(p); 
            } 
        }
        return postulacionesCount.size();
    }
}
