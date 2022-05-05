package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Criar um algoritmo que entre com cinco números e imprimir o quadrado de cada
        * */

        double[] numeros = new double[5];
        Scanner scanner = new Scanner(System.in);

        for(int contador = 0; contador < 5; contador ++) {
            System.out.println("Digite um numero: ");
            numeros[contador] = scanner.nextDouble();
        }

        for (int contador = 0; contador < 5; contador ++) {
            String message = String.format("%.2f ^ 2 = %.2f", numeros[contador], Math.pow(numeros[contador], 2));
            System.out.println(message);
        }
    }
}
