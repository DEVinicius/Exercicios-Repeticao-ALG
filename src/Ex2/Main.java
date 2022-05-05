package Ex2;

public class Main {
    public static void main(String[] args) {
        /*
        * Criar um algoritmo que imprima todos os números pares no intervalo 1-50.
        * */

        int contador = 0;
        while(contador <= 50) {
            if(contador %2 == 0) {
                System.out.println(contador);
            }
            contador ++;
        }
    }
}
