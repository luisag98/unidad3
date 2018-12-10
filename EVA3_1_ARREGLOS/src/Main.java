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
        // ARREGLOS: ES UNA SECUENCIA CONTIGUA DE VARIABLES DEL MISMO TIPO
        // CAPTURAR MUCHOS DATOS DEL MISMO TIPO
        // CAPTURAR EDAD, IMPRIMIR, CALCULAR MEDIA
        // TEC 2 --> 3 MIL ESTUDIANTES (4 bytes) = 12 mil bytes --> 12 kb
        // USAMOS UN ARREGLO
        // TIPO DE DATO [] NOMBRE DEL IDENTIFICADOR = NEW TIPO DE DATO [TAMAÑO]
        // LOS ARREGLOS SON DE ACCESO ALEATORIO
        // ACCESO SECUENCIAL: 
        int[] aiEdad = new int[3000];
        // ARREGLOS EN JAVA, C, C++ TIENEN DIRECCIONES PARA CADA POSICION
        // 0 ES LA PRIMERA --> N-1 ES LA ÚLTIMA SIENDO N EL TAMAÑO DEL ARREGLO
        System.out.println(aiEdad.length);
        System.out.println("PRIMER POSICIÓN = " + aiEdad[0]);
        System.out.println("ÚLTIMA POSICIÓN = " + aiEdad[2999]);
        // LENARLO CON EDADES:
        // 17 - 40
        for (int i = 0; i < aiEdad.length; i++) {
            int iEdad = (int)(Math.random()*41);
            aiEdad[i] = iEdad;
        }
        for (int i = 0; i < aiEdad.length; i++) {
            System.out.println(aiEdad[i]);
        }
        // FOR EACH
        for (int i : aiEdad) {
            System.out.println("FOR EACH - " + i);
        }
        // SUMATORIA PARA CALCULAR LA MEDIA
        int iAcum = 0;
        for (int i = 0; i < aiEdad.length; i++) {
            iAcum += aiEdad[i];
        }
        System.out.println("La media es " + (double)(iAcum/3000));
        
    }
    
}
