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
        int[] aiEnteros, x, y, z; // TODOS SON ARREGLOS
        int aiEnteros2[], a, b, c; // SOLO aiEnteros2 ES ARREGLO
        // ARREGLO PARA 10 ENTEROS
        aiEnteros = new int[10];
        //System.out.println(aiEnteros); // DIRECCION DE MEMORIA
        
        for (int i = 0; i < aiEnteros.length; i++) {
            aiEnteros[i] = (int)(Math.random()*10);
        }
        
        for (int i : aiEnteros) {
            System.out.println("valor = " + i);
        }
    }
    
}
