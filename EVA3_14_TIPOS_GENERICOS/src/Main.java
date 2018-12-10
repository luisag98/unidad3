/*
 
 */

/**
 *
 * @author temporal2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona <String, Double>pObj = new Persona();
        pObj.setNombre("Luisa");
        pObj.setApellido("Gonzalez");
        pObj.setClave("18550352");
        pObj.setOtroDato(18.3);
        Persona <Integer, Boolean>pObjInt = new Persona();
        // int = Integer
        // double = Double
        pObjInt.setNombre("Juan");
        pObjInt.setApellido("Perez");
        pObjInt.setClave(100);
        pObjInt.setOtroDato(true);
        
        
    }
    
}
//EL USO DE LA T NOS PERMITE CAMBIAR EL TIPO DE DATO A LO QUE QUERAMOS DESPUES
class Persona <T,S>{
    private String nombre, apellido;
    private T clave;
    private S otroDato;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public T getClave() {
        return clave;
    }

    public void setClave(T clave) {
        this.clave = clave;
    }

    public S getOtroDato() {
        return otroDato;
    }

    public void setOtroDato(S otroDato) {
        this.otroDato = otroDato;
    }
    
    
}