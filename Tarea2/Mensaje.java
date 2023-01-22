
/**
 * Write a description of class Mensaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mensaje
{
    // instance variables - replace the example below with your own
    private String texto;
    private String fecha_creacion;
    private String de;
    private String para;

    /**
     * Constructor for objects of class Chat
     */
    public Mensaje()
    {
        // initialise instance variables
        this.texto = texto;
        this.fecha_creacion = fecha_creacion;
        this.de = de;
        this.para = para;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getTexto()
    {
        // put your code here
        return texto;
    }
    
    public String getFecha_creacion()
    {
        return fecha_creacion;
    }
    
    public String getDe()
    {
        return de;
    }
    
    public String getPara()
    {
        return para;
    }
}