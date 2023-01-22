import java.util.ArrayList;
/**
 * Write a description of class Chat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chat
{
    // instance variables - replace the example below with your own
    private boolean esta_activo;
    private ArrayList<Mensaje> mensajes;
    private ArrayList<Usuario> usuarios_chat;

    /**
     * Constructor for objects of class Chat
     */
    public Chat()
    {
        // initialise instance variables
        this.esta_activo = esta_activo;
        mensajes = new ArrayList<Mensaje>();
        usuarios_chat = new ArrayList<Usuario>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean getEstaActivo()
    {
        // put your code here
        return esta_activo;
    }
    

}
