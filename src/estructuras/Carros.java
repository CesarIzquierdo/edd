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
public class Carros
{
    private String modelo;
    private int anio;

    public Carros()
    {
    }

    public Carros(String modelo, int anio)
    {
        this.modelo = modelo;
        this.anio = anio;
    }

    /**
     * @return the modelo
     */
    public String getModelo()
    {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    /**
     * @return the anio
     */
    public int getAnio()
    {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio)
    {
        this.anio = anio;
    }
    
    public String desp()
    {
        return 
                "MODELO ="+ modelo + "\n" +
                "AÑO    ="+ anio + "\n" ;
    }
}
