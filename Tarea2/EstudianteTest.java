

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * The test class EstudianteTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EstudianteTest
{
    /**
     * Default constructor for test class EstudianteTest
     */
    public EstudianteTest()
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
    
    Estudiante estudian1 = new Estudiante("1", "Jose Diaz Rodriguez", "Calle 80 #22", "Developer PHP", "josediaz@gmail.com", "3225567781", "password", "foto.jpg", 1, "Universidad Industrial de Santander", "CV.pdf");
    Estudiante estudian2 = new Estudiante("2", "Laura Liliana Mendoza", "Avenida 72 Calle 100", "Desarrolldora PHP Semi-senior ", "lalimendoza@gmail.com", "3128961701", "mendoza72", "foto_perfil.jpg", 1, "Universidad del Valle", "Curriculum.pdf");

    @Test
    public void testRealizarPostulacion()
    {
        assertEquals(true, estudian1.realizarPostulacion("Developer PHP con experiencia en Laravel y PostgreSQL", "Jose Diaz Rodriguez"));
    }

    @Test
    public void testGetNumeroDePostulaciones()
    {
        
        estudian1.realizarPostulacion("Desarrollador PHP con experiencia en Laravel y PostgreSQL", "Jose Diaz Rodriguez");
        estudian1.realizarPostulacion("Desarrollador Junior PHP", "Jose Diaz Rodriguez");
        estudian1.realizarPostulacion("Ingeniero de sistemas con habilidades de desarrollo php, postgresql, mysql. ", "Jose Diaz Rodriguez");
        
        assertEquals(3, estudian1.getNumeroDePostulaciones());
    }
    
    @Test
    public void testBuscarPasantia()
    {
        ArrayList<Pasantia> resultadosBusqueda = new ArrayList<Pasantia>();
        ArrayList<String> resultadosFinales = new ArrayList<String>();
        
        resultadosFinales.add("Desarrollador PHP con experiencia en Laravel y PostgreSQL");
        resultadosFinales.add("Desarrollador junior PHP con experiencia en gerencia de proyectos");
        
        resultadosBusqueda.add(new Pasantia("Desarrollador PHP con experiencia en Laravel y PostgreSQL", "Se busca desarrollador PHP, con buen manejo de framework laravel y motor de base de datos PostgreSQL" ,"KONECTA"));
        resultadosBusqueda.add(new Pasantia("Desarrollador junior PHP con experiencia en gerencia de proyectos", "Se busca desarrollador senior PHP, indispensable contar con experiencia manejando equipos multidisciplinarios" ,"beBee"));
        resultadosBusqueda.add(new Pasantia("Ingeniero de sistemas con experiencia en Ruby on Rails, con conocimiento en PostgreSQL, Mysql y Redis", "Se busca Ingeniero de sistemas con experiencia en Ruby bases de datos, indispensable basta experiencia con bases de datos relacionales" ,"InnovaSoft"));
        assertEquals(resultadosFinales, estudian1.buscarPasantia("PHP", resultadosBusqueda));
    }
    
    @Test
    public void testCancelarPostulacion()
    {
        //ArrayList<Postulacion> postulacionesEstudiante = new ArrayList<Postulacion>();
        
        estudian2.realizarPostulacion("Desarrollador NodeJS con experiencia en framework Angular", "Laura Liliana Mendoza");
        estudian2.realizarPostulacion("Desarrollador full-stack con conocimiento medio en Angular, NodeJS y TypeScript", "Laura Liliana Mendoza");
        estudian2.realizarPostulacion("Ingeniero de sistemas con amplios conocimientos en Angular, Typescript, Nodejs y MongoDB", "Laura Liliana Mendoza");
        estudian2.realizarPostulacion("Desarrollador frontend junior con conocimiento del framework Angular", "Laura Liliana Mendoza");
    
        assertEquals(3, estudian2.cancelarPostulacion(2));
    }
}



