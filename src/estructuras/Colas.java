/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 * Clase Colas estáticas (Primero en entrar primero en salir = PEPS)
 * Características : para su representación usan arreglos, no se pueden
 * recorrer, como tada estructura tiene inserta y elimina como métodos
 * principales
 *
 * @author Mauro
 */
public class Colas<T>
{

    private T[] cola;
    private int atras = -1; // indica que la cola esta vacia 

    public Colas(T pila[])
    {
        this.cola = pila;
    }

    /**
     * @return the cola
     */
    public T[] getCola()
    {
        return cola;
    }

    /**
     * @param cola the cola to set
     */
    public void setCola(T[] cola)
    {
        this.cola = cola;
    }

    /**
     * @return the atras
     */
    public int getAtras()
    {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    public void setAtras(int atras)
    {
        this.atras = atras;
    }

    public void inserta(T dato)
    {
        if (llena())
        {
            System.out.println("Cola llena " + dato);
        } else
        {
            cola[++atras] = dato;
        }
    }

    public T elimina()
    {
        if (vacia())
        {
            System.out.println("Cola vacia");
            return null;
        } else
        {
            T de = cola[0]; // el dato a eliminar siempre esta en la posición cero
            for (int i = 0; i < atras; i++)
            {
                cola[i] = cola[i + 1]; //recorre todos los elementos una posición adelante
            }
            atras--; //como se recorrieron todos los datos una posición el atras se recorre una posición
            return de;
        }
    }

    public boolean vacia()
    {
        return atras == -1;
    }

    public boolean llena()
    {
        return atras + 1 == cola.length;
    }

}
