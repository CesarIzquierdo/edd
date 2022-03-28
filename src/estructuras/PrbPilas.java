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
public class PrbPilas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Carros arr[]= new Carros[7];
        
        Pilas<Carros> obj = new Pilas<Carros>(arr);
        obj.inserta(new Carros("TIIDA", 2021));
        obj.inserta(new Carros("MUSTANG", 2021));
        obj.inserta(new Carros("TSURU", 2021));
        obj.inserta(new Carros("VOCHO", 2021));
        obj.inserta(new Carros("McLaren", 2021));
        obj.inserta(new Carros("Ferrari LA", 2021));
        obj.inserta(new Carros("LAMBORGHINI", 2021));
        obj.inserta(new Carros("SENTRA", 2021));
        System.out.println(obj.elimina().desp());
        System.out.println(obj.elimina().desp());
        System.out.println(obj.elimina().desp());
        System.out.println(obj.elimina().desp());
        System.out.println(obj.elimina().desp());
        System.out.println(obj.elimina().desp());
        System.out.println(obj.elimina().desp());
        System.out.println(obj.elimina());
    }
    
}
