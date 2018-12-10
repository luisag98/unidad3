/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] apTodos = new Persona[10];
        apTodos[0] = new Alumno();
        apTodos[1] = new Alumno();
        apTodos[2] = new Alumno();
        apTodos[3] = new Alumno();
        apTodos[4] = new Alumno();
        apTodos[5] = new Empleado();
        apTodos[6] = new Empleado();
        apTodos[7] = new Empleado();
        apTodos[8] = new Empleado();
        apTodos[9] = new Empleado();
        
        for (int i = 0; i < apTodos.length; i++) {
            //SI ES ALUMNO LLENARLO CON JUAN PEREz Y 0011
            //SI ES EMPLEADO LLENARLO CON PEDRO PARAMO Y 1000
            if(apTodos[i] instanceof Alumno){
                Alumno aObj = (Alumno)apTodos[i];
                aObj.nombre = "Juan";
                aObj.apellido = "Perez";
                aObj.noControl = "0011";
            }
            else{
                Empleado eObj = (Empleado)apTodos[i];
                eObj.nombre = "Pedro";
                eObj.apellido = "Paramo";
                eObj.claveEmpleado = 1000;
            }
        }
        
        for (int i = 0; i < apTodos.length; i++) {
        }
    }
    
}

class Empleado extends Persona{
    int claveEmpleado;
}

class Alumno extends Persona{
    String noControl;
}

class Persona{
    String nombre;
    String apellido;
}
