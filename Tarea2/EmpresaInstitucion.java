
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

    /**
     * Constructor for objects of class EmpresaInstitución
     */
    public EmpresaInstitucion(String nombre, String direccion, String descripcion, String correo, String telefono, String contrasenia, String foto,
    int tipoUsuario)
    {
        super(nombre, direccion, descripcion, correo, telefono, contrasenia, foto, tipoUsuario);
        this.webpage = webpage;
    }

    public String getWebpage()
    {
        // put your code here
        return webpage;
    }
}
