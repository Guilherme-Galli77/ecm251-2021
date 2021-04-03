package galli.cury.guilherme;

import java.util.Random;

public class Transacoes {

    //Métodos

    private static int getRandomNumberInRange(int min, int max) {  // Gerar número aleatório
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static String gerarQRCode(int idConta, String nome, double valor) { // Gerar QRcode
        String QRCode = (idConta + ";" + nome + ";" + valor + ";" + getRandomNumberInRange(1000, 9999));
        return QRCode;
    }

}