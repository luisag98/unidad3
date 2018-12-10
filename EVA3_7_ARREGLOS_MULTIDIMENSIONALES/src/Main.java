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
        int aiMatriz[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aiMatriz[i][j] = (int)(Math.random()*100);
            }
        }
        System.out.println(aiMatriz); // ARREGLO
        System.out.println(aiMatriz[0]); // ARREGLO
        System.out.println(aiMatriz[0][0]); // VALOR
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                System.out.println(aiMatriz[i][j]);
            }
        }
        System.out.println("USANDO FOR EACH");
        for (int[] is : aiMatriz) {
            for (int i : is) {
                System.out.println(i);
            }
        }
    }
}
