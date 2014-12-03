
/**
 * Write a description of class bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bebedor
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int alcoholimetro;

    /**
     * Constructor for objects of class bebedor
     */
    public bebedor(String nombre)
    {
        // initialise instance variables
        this.nombre = nombre;
        alcoholimetro = 0;
    }
    
     public void beber(cubata copa)
    {
    if (alcoholimetro<=10)
    {
        alcoholimetro = alcoholimetro + copa.nivAlCopa();
    }
    else
    {
        System.out.println("Pfff, no quieroh má que zi no a ve como iego casa....¡hip!");
    }
    }
    
        public int nivelAlc()
    {
        return alcoholimetro;
    }
    
    public void preguntar(String pregunta)
    {
    String preg= pregunta;
    int cant = preg.length();
    
    if (alcoholimetro<=10)
    {
       if ((cant / 2) == 0)
       {
           System.out.println("Si");
       }
       else
       {
           System.out.println("No");
       }
    }
    else
    {
        if (preg.contains("nombre"))
        {
            System.out.println(preg.toUpperCase());
        }
    }
    }
}
