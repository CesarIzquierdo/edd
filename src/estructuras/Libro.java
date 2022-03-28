/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author Mauro
 */
public class Libro
{
    private String autor;
    private String nombre;

    public Libro(String autor, String nombre)
    {
        this.autor = autor;
        this.nombre = nombre;
    }

    /**
     * @return the autor
     */
    public String getAutor()
    {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor)
    {
        this.autor = autor;
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
    
    public String desp()
    {
        return 
                "AUTOR  = " + autor + "\n" +
                "NOMBRE = " + nombre + "\n" ;
                
    }
}
