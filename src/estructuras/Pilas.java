/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 * Clase Pilas estáticas (Último en entrar primero en salir = UEPS)
 * Características : para su representación usan arreglos, no se pueden recorrer,
 *                   como tada estructura tiene inserta y elimina como métodos
 *                   principales
 * @author Mauro
 */
public class Pilas <T>
{
    private T pila[];
    private int tope=-1;  // indica que la pila esta vacia

    public Pilas(T n[])
    {
        pila = n;
    }
    
    public T[] getPila()
    {
        return pila;
    }

    public void setPila(T[] pila)
    {
        this.pila = pila;
    }

    public int getTope()
    {
        return tope;
    }

    public void setTope(int tope)
    {
        this.tope = tope;
    }

    
    public void inserta(T dato)
    {
        if(!llena())
        {
            pila[++tope]=dato;
        }else
        {
            System.out.println(" Pila llena");
        }
    }
    
    public T elimina()
    {
        if(vacia())
        {
            System.out.println("Pila vacia");
            return null;
        }else
        {
            return pila[tope--];
        }
    }
    
    public  boolean vacia()
    {
        return tope==-1;
    }
    
    public boolean llena()
    {
        return tope == pila.length-1;
    }

        
}
