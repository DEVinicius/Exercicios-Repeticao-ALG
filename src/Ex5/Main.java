package Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *  Entrar com uma mensagem e imprimir quantas letras A E / O e U tem esta mensagem (considerar
minúscula e maiúscula).
        * */

        Scanner scanner = new Scanner(System.in);
        String texto = "";
        int contadorVogais = 0;

        System.out.println("Digite uma mensagem");
        texto = scanner.nextLine();

        for (int posicaoLetra = 0; posicaoLetra < texto.length(); posicaoLetra++) {
            if(
                    texto.toUpperCase().charAt(posicaoLetra) == 'A' ||
                    texto.toUpperCase().charAt(posicaoLetra) == 'E' ||
                    texto.toUpperCase().charAt(posicaoLetra) == 'I' ||
                    texto.toUpperCase().charAt(posicaoLetra) == 'O' ||
                    texto.toUpperCase().charAt(posicaoLetra) == 'U'
            ) {
                contadorVogais ++;
            }
        }

        System.out.println("Numero de vogais eh igual a " + contadorVogais);
    }
}
