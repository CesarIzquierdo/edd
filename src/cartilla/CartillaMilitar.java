package cartilla;

/**
 *
 * @author cesar
 */
public class CartillaMilitar
{

    private String nombre;
    private String clase;
    private String remisos;

    public CartillaMilitar()
    {
    }

    public CartillaMilitar(String nombre)
    {
        this.nombre = nombre;
    }

    public CartillaMilitar(String nombre, String clase)
    {
        this.nombre = nombre;
        this.clase = clase;
    }

    public CartillaMilitar(String nombre, String clase, String remisos)
    {
        this.nombre = nombre;
        this.clase = clase;
        this.remisos = remisos;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the clase
     */
    public String getClase()
    {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(String clase)
    {
        this.clase = clase;
    }

    /**
     * @return the remisos
     */
    public String getRemisos()
    {
        return remisos;
    }

    /**
     * @param remisos the remisos to set
     */
    public void setRemisos(String remisos)
    {
        this.remisos = remisos;
    }
    
    
    public String desp()
    {
        return 
                ""+nombre+"\n"+ // nombre
                ""+clase+"\n"+ // clase
                "" +remisos+"\n";// remisos
    }
}
