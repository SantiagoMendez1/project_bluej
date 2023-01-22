
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // instance variables - replace the example below with your own
    private String id;
    private String nombre;
    private String direccion;
    private String descripcion;
    private String correo;
    private String telefono;
    private String contrasenia;
    private String foto;
    private int tipoUsuario;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario( String id, String nombre, String direccion, String descripcion, String correo, String telefono, String contrasenia, String foto,
    int tipoUsuario)
    {
        // initialise instance variables
        this.id = id; 
        this.nombre = nombre;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasenia = contrasenia;
        this.foto = foto;
        this.tipoUsuario = tipoUsuario;
    }
    public String getId()
    {
        // put your code here
        return id;
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
    
    public String getContrasenia(){
        return contrasenia;
    }
    
    public String getFoto(){
        return foto;
    }
    
    public int getTipoUsuario(){
        return tipoUsuario;
    }
}
