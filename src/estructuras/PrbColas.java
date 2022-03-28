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
public class PrbColas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
          Libro arr[]= new Libro[5];
          
          Colas <Libro>obj = new Colas<Libro>(arr);
          obj.inserta(new Libro("Luis Joyanes", "EDD en Java"));
          obj.inserta(new Libro("Tenebaunm", "EDD en Java"));
          obj.inserta(new Libro("Mauro Sanchez", "EDD en Java"));
          obj.inserta(new Libro("Kendall y Kendall", "EDD en Java"));
          obj.inserta(new Libro("Roger Pressman", "EDD en Java"));
          obj.inserta(new Libro("vacio", "vacio"));
          System.out.println("DE = " + obj.elimina().desp());
          obj.inserta(new Libro("vacio", "vacio"));
          System.out.println("DE = " + obj.elimina().desp());
          System.out.println("DE = " + obj.elimina().desp());
          System.out.println("DE = " + obj.elimina().desp());
          System.out.println("DE = " + obj.elimina().desp());
          System.out.println("DE = " + obj.elimina());
    }
    
}
