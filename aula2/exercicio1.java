package aula2;
import java.util.Scanner;

class exercicio1 {
    
    public static void main(String[] args) {

        int numero;
        boolean pertence;

        Scanner verificacao = new Scanner(System.in);

        System.out.println("digite os numeros: ");
        numero = verificacao.nextInt(); 

        pertence = (numero >= -10 && numero <= 30);

        System.out.println("confere os numeros? " + pertence);


        verificacao.close();
    }
}