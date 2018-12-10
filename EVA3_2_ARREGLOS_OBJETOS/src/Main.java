/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luisa María González Ordóñez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] apAlumnos = new Persona[5];
        for (int i = 0; i < apAlumnos.length; i++) {
            apAlumnos[i] = new Persona("Juan Perez");
        }
        for (int i = 0; i < apAlumnos.length; i++) {
            apAlumnos[i].imprimir();
        }
    }
    
}

class Persona{
    public String nombre;
    public void imprimir(){
        System.out.println(nombre);
    }
    public Persona(String nombre){
        this.nombre = nombre;
    }
}