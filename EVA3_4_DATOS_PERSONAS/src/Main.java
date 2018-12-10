
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        String asNombre[] = new String[10];
        int aiEdad[] = new int[10];
        int iMedia = 0;
        
        for (int i = 0; i < asNombre.length; i++) {
            System.out.println("Introduzca su nombre y edad: ");
            asNombre[i] = sc.nextLine();
            aiEdad[i] = sc.nextInt();
            sc.nextLine();
            iMedia += aiEdad[i];            
        }
        
        for (int i = 0; i < asNombre.length; i++) {
            System.out.println("Nombre: " + asNombre[i] + " Edad: " + aiEdad[i]);
        }
        
        System.out.println("Media de las edades: " + (double)(iMedia/10));
        
    }
    
}
