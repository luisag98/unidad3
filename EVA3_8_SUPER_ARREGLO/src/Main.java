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
        int aiMDatos[][][][] = new int[2][3][4][5];
        
        for (int i = 0; i < aiMDatos.length; i++) {
            for (int j = 0; j < aiMDatos[i].length; j++) {
                for (int k = 0; k < aiMDatos[i][j].length; k++) {
                    for (int l = 0; l < aiMDatos[i][j][k].length; l++) {
                        aiMDatos[i][j][k][l] = (int)(Math.random()*100);
                    }
                }
            }
        }
        for (int i = 0; i < aiMDatos.length; i++) {
            for (int j = 0; j < aiMDatos[i].length; j++) {
                for (int k = 0; k < aiMDatos[i][j].length; k++) {
                    for (int l = 0; l < aiMDatos[i][j][k].length; l++) {
                        System.out.println(aiMDatos[i][j][k][l]);
                    }
                }
            }
        }
    }
    
}
