package galli.cury.guilherme;

import java.util.Random;

public class basico03 {
    //Estruturas de repeticao
    public static void main(String[] args) {
        int limite = 10;
        int contador;
        for (contador = 0; contador < limite; contador++){
            System.out.println("Contador:" + contador);
        }


        int senha = 123456;
        //Objeto que possibilita pegar numeros aleatorios
        Random sorteador = new Random();
        int chute = sorteador.nextInt(999999);
        int tentativas = 0;
        while (chute != senha){
            System.out.println("Tentativa:"+ tentativas);
            System.out.println("Chute:"+ chute );
            chute = sorteador.nextInt(999999);
            tentativas++;
        }
        System.out.println("Parabens Hackerman!");
    }
}
