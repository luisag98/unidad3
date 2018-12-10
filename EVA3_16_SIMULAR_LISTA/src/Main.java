
//@author Luisa María González Ordóñez

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista aLista[] = new Lista[5];
        /*
        for (int i = 0; i < aLista.length; i++) {
            aLista[i] = new <Integer> Lista();
        }*/
        aLista[0] = new <Integer> Lista();
        aLista[1] = new <Integer> Lista();
        aLista[2] = new <Integer> Lista();
        aLista[3] = new <Integer> Lista();
        aLista[4] = new <Integer> Lista();
        
        //aLista[0] = new Lista<Integer>();
        for (int i = 0; i < 5; i++) {
            aLista[i].setDato(5);
        }
        for (int i = 0; i < 5; i++) {
            aLista[i].getDato();
        }
        
        
    }
    
}

class Lista <T>{
    private T dato;

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    
    
}
