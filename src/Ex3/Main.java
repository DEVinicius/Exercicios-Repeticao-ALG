package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        * Criar um algoritmo que imprima a tabuada de multiplicação de qualquer número informado
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero = scanner.nextDouble();

        for (int contador = 1; contador <= 10; contador++) {
            String message = String.format("%.2f x %d = %.2f", numero, contador, ((double) numero * contador));
            System.out.println(message);
        }
    }
}
