/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colectivoconvertirpesetas;

import java.util.Scanner;

/**
 *
 * @author Jose David Tabernero
 */
public class ColectivoConvertirPesetas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = 0;
        int opciones = 0;
        float euros;
        float resultadoEuros;
        int pesetas = 0;

        casos = sc.nextInt();

        for (int i = 1; i <= casos; i++) {

            while (opciones != 3) {

                System.out.println("1. Pasar de pesetas a euros");
                System.out.println("2. Pasar de euros a pesetas");
                System.out.println("3. Salir");
                opciones = sc.nextInt();

                if (opciones == 1) {
                    System.out.println("Introduzca cantidad: ");
                    pesetas = sc.nextInt();
                   
                } else if (opciones == 2) {
                    System.out.println("Introduzca cantidad: ");
                    euros = sc.nextFloat();
                   
                }
            }
            System.out.println("SIGUIENTE CASO");
            opciones = 0;
        }
    }
    
}
