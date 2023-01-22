
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Usuario
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String direccion;
    private String descripcion;
    private String correo;
    private String telefono;
    private String contraseña;
    private String foto;
    private boolean esEstudiante;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario()
    {
        // initialise instance variables
        this.nombre = nombre;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.correo = correo;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.foto = foto;
    }
    
    public String getNombre()
    {
        // put your code here
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public String getContraseña(){
        return contraseña;
    }
    
    public String getFoto(){
        return foto;
    }
}
