package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Criar um algoritmo que imprima a tabuada de qualquer número informado, conforme a opção
informada: 0=Sair 1=Soma 2=Subtração 3=Multiplicação 4=Divisão
        * */

        Scanner scanner = new Scanner(System.in);

        boolean isMenuWorking = true;
        double numero = 0;
        int escolhaUsuario = 0;

        while(isMenuWorking) {
            System.out.println("Digite um numero");
            numero = scanner.nextDouble();

            String message = String.format("Digite\n0 - Sair\n1 - Soma\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao");
            System.out.println(message);

            escolhaUsuario = scanner.nextInt();

            switch (escolhaUsuario) {
                case 0:
                    isMenuWorking = false;
                    System.out.println("Ate mais");
                    break;

                case 1:
                    for (int contador = 1; contador <= 10; contador ++) {
                        String messageSum = String.format("%.2f + %d = %.2f", numero, contador, ((double) numero + contador));
                        System.out.println(messageSum);
                    }
                    break;

                case 2:
                    for (int contador = 1; contador <= 10; contador ++) {
                        String messageSub = String.format("%.2f - %d = %.2f", numero, contador, ((double) numero - contador));
                        System.out.println(messageSub);
                    }
                    break;

                case 3:
                    for (int contador = 1; contador <= 10; contador ++) {
                        String messageMult = String.format("%.2f x %d = %.2f", numero, contador, ((double) numero * contador));
                        System.out.println(messageMult);
                    }
                    break;

                case 4:
                    for (int contador = 1; contador <= 10; contador ++) {
                        String messageDiv = String.format("%.2f / %d = %.2f", numero, contador, ((double) numero / contador));
                        System.out.println(messageDiv);
                    }
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }
    }
}
