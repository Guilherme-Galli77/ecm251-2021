package galli.cury.guilherme;

//IMPORTACOES

import java.util.Random;

//METODOS

public class Transacoes {

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static String gerarQRCode(int idConta, String nome, double valor) { // Gerar QRcode
        String QRCode = (idConta + ";" + nome + ";" + valor + ";" + getRandomNumberInRange(1000, 9999));
        return QRCode;
    }

}