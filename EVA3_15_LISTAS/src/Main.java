
import java.util.ArrayList;
import java.util.List;

/*
Arreglos --> no pueden modificar su tamaño, son inmutables
Listas -->

*/

//@author Luisa María González Ordóñez

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List <Integer>lsMiLista = new ArrayList();
        lsMiLista.add(100);
        lsMiLista.add(25);
        lsMiLista.add(62);
        lsMiLista.add(17);
        lsMiLista.add(300);
        //System.out.println(lsMiLista);
        for (int i = 0; i < lsMiLista.size(); i++) {
            System.out.println(lsMiLista.get(i));
        }
        
    }
    
}
