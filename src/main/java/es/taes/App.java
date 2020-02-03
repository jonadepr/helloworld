package es.taes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String miMensaje = "Mi hola MUNDO!!";
        System.out.println(miMensaje);
        Persona luis = new Persona();
        luis.setEdad(42);
        luis.setNombre("Luis");
        System.out.println(luis);
    }
}
