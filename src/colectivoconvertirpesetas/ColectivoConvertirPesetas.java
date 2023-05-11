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
                    resultadoEuros = pasarAEuros(pesetas);
                    System.out.println("Son " + redondearNdecimales(resultadoEuros, 2) + " euros");
                } else if (opciones == 2) {
                    System.out.println("Introduzca cantidad: ");
                    euros = sc.nextFloat();
                    System.out.println("Son " + pasarAPesetas(euros) + " pesetas");
                }
            }
            System.out.println("SIGUIENTE CASO");
            opciones = 0;
        }
    }

    static int pasarAPesetas(float euros) {
        int resultado = 0;
        float valorPeseta = 166.386F;

        resultado = (int) Math.round(valorPeseta * euros);
        return resultado;

    }

    static float pasarAEuros(int pesetas) {
        float resultado;
        float valorPeseta = 166.386F;

        resultado = (pesetas / valorPeseta);

        return resultado;
    }

    static float redondearNdecimales(float numero, int decimales) {

        float resultado = 0;
        float numeroDecimales = 0;

        numeroDecimales = (float) Math.pow(10, decimales);
        resultado = Math.round(numero * numeroDecimales) / numeroDecimales;
        return resultado;

    }
    public class ConversorMoneda {
    public static double eurosADolares(double euros) {
        double tipoCambio = 1.18; // Tipo de cambio actual
        double dolares = euros * tipoCambio;
        return dolares;
    }

    public static void main(String[] args) {
        double euros = 100; // Cantidad en euros a convertir
        double dolares = eurosADolares(euros);
        System.out.println(euros + " euros son equivalentes a " + dolares + " dólares.");
    }
}

}
    
   

