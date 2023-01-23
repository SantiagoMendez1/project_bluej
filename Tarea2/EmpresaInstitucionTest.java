

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 * The test class EmpresaInstitucionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EmpresaInstitucionTest
{
    /**
     * Default constructor for test class EmpresaInstitucionTest
     */
    public EmpresaInstitucionTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    EmpresaInstitucion empresaI1 = new EmpresaInstitucion("1", "Universidad Pedagógica y Tecnológica de Colombia", "Cl. 28 #23 - 75", "Una universidad con conciencia de clase", "uptc@correo.uptc.co", "3125679100", "%$6jw&", "UPTC_logo.jpg", 2);
    EmpresaInstitucion empresaI2 = new EmpresaInstitucion("2", "IBM", "Cl. 67 #53-108", "Empresa de tecnologia lider en el mercado", "ibm@correo.ibm.co", "3028917716", "pass#56", "IBM_logo.jpg", 2);
    EmpresaInstitucion empresaI3 = new EmpresaInstitucion("3", "Rappi", "Cra 45 #2685, Bogotá", "App #1 en domicilios en Colombia", "rappi@rappi.co", "3129935125", "23473", "logo.jpg", 2);
    
    @Test
    public void testCrearPasantia()
    {
        assertEquals(true, empresaI1.crearPasantia("Desarrollador Backend con conocimientos en Go", "Se busca desarrollador en Go, proactivo, responsable y que se ponga la 10", "UPTC"));
    }
    
    @Test
    public void testEliminarPasantia(){
        
        empresaI2.crearPasantia("Diseñador UI/UX design", "Se busca diseñador con 3 años de experiencia en creacion de mockup para app moviles", "IBM");
        empresaI2.crearPasantia("Ingeniero Industrial - Programa Blue Journey", "Vacante para estudiante de ingenieria industrial de ultimos semestres", "IBM");
        empresaI2.crearPasantia("Auxiliar Contable", "Se busca auxiliar contable de preferencia estudiante de contaduría, técnico o tecnólogo en carreras administrativas o contables", "IBM");
        
        assertEquals(2, empresaI2.eliminarPasantia(0));
    }
    
    @Test
    public void testActualizarPasantia(){
        empresaI2.crearPasantia("Diseñador UI/UX design", "Se busca diseñador con 3 años de experiencia en creacion de mockup para app moviles", "IBM");
        Pasantia pasantiaPrueba = new Pasantia("Diseñador UI/UX design", "Se busca diseñador con 6 meses de experiencia en creacion de mockups para app moviles", "Microsoft");
        
        assertEquals(true, empresaI2.actualizarPasantia(0, "Diseñador UI/UX design", "Se busca diseñador con 6 meses de experiencia en creacion de mockups para app moviles", "Microsoft"));
    }
    
    Estudiante estudian1 = new Estudiante("1", "Jose Diaz Rodriguez", "Calle 80 #22", "Developer PHP", "josediaz@gmail.com", "3225567781", "password", "foto.jpg", 1, "Universidad Industrial de Santander", "CV.pdf");
    Estudiante estudian2 = new Estudiante("2", "Laura Liliana Mendoza", "Avenida 72 Calle 100", "Desarrolldora PHP Semi-senior ", "lalimendoza@gmail.com", "3128961701", "mendoza72", "foto_perfil.jpg", 1, "Universidad del Valle", "Curriculum.pdf");
    @Test
    public void testContarPostulaciones(){
        empresaI3.crearPasantia("Diseñador UI/UX design", "Se busca diseñador con 6 meses de experiencia en creacion de mockup para app moviles", "Rappi");
        //empresaI3.crearPasantia("Ingeniero de Sistemas con conocimiento en desarrollo Frontend", "Se busca estudiante de ultimos semestres de ingenieria de sistemas o afines con conocimiento en desarrollo frontend usando el framework React", "Rappi");
        //empresaI3.crearPasantia("Auxiliar Contable", "Se busca auxiliar contable de preferencia estudiante de contaduría, técnico o tecnólogo en carreras administrativas o contables", "Rappi");
        //empresaI3.crearPasantia("Auxialiar Administrativo", "Se busca estudiante de contaduria, contabilidad o afines", "Rappi");
        //empresaI3.crearPasantia("Ingeniero Industrial con conocimiento de optimizacion de procesos", "Vacante para estudiante de ingenieria industrial de ultimos semestres", "Rappi");
        ArrayList<Postulacion> postulacionesRecibidas = new ArrayList<Postulacion>();
        LocalDateTime fecha = java.time.LocalDateTime.now();
        
        postulacionesRecibidas.add(new Postulacion("Diseñador UI/UX design", "Jose Diaz Rodriguez", fecha, "enviado"));
        postulacionesRecibidas.add(new Postulacion("Diseñador UI/UX design", "Laura Liliana Rodriguez", fecha, "enviado"));
        
        assertEquals(2, empresaI3.contarPostulaciones("Diseñador UI/UX design", postulacionesRecibidas));
    }
}

