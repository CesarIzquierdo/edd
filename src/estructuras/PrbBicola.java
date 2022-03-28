package estructuras;

/**
 *
 * @author Mauro
 */
public class PrbBicola {

    public static void main(String[] args) {
        String cad[] = new String[10];
        Bicolas<String> bc = new Bicolas<String>(cad);
        //marcas de autos se insertarán de lado izq (modifica el atras1)
        bc.setAtras1(bc.inserta("FORD", bc.getAtras1(), bc.getAtras2(), 1));
        bc.setAtras1(bc.inserta("NISSAN", bc.getAtras1(), bc.getAtras2(), 1));
        bc.setAtras1(bc.inserta("AUDI", bc.getAtras1(), bc.getAtras2(), 1));
        //marcas de computadoras se insertarán de lado der (modifica el atras2)
        bc.setAtras2(bc.inserta("DELL", bc.getAtras2(), bc.getAtras1(), -1));
        bc.setAtras2(bc.inserta("LENOVO", bc.getAtras2(), bc.getAtras1(), -1));
        bc.setAtras2(bc.inserta("SONY", bc.getAtras2(), bc.getAtras1(), -1));
        //Eliminación requiere un arreglo para recibir el dato eliminado y para
        //recibir el nuevo atras
        //para eliminar de lado derecho
        Object arr[] = bc.elimina(bc.getAtras2(), bc.getCola().length, -1);
        bc.setAtras2((int) arr[1]);
        System.out.println("DE = " + arr[0]);
        arr = bc.elimina(bc.getAtras2(), bc.getCola().length, -1);
        bc.setAtras2((int) arr[1]);
        System.out.println("DE = " + arr[0]);
        // para eliminar de lado izquierdo
        arr = bc.elimina(bc.getAtras1(), -1, 1);
        bc.setAtras1((int) arr[1]);
        System.out.println("DE = " + arr[0]);
        arr = bc.elimina(bc.getAtras1(), -1, 1);
        bc.setAtras1((int) arr[1]);
        System.out.println("DE = " + arr[0]);

    }

}
