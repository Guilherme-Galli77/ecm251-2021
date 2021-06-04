package br.maua.array_list_test_drive;

import br.maua.models.Conta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTestDrive {
    public static void main(String[] args) {
        //Cria um ArrayList com Contas
        List<Conta> contas = new ArrayList<>();

        //Adiciona objetos Conta dentro do arrayList
        contas.add(new Conta(89));
        contas.add(new Conta());
        contas.add(1, new Conta(55));
        contas.addAll(Arrays.asList(new Conta(),
                new Conta(58)));

        System.out.println("Exibe o ArrayList de Contas:");
        contas.forEach((conta) -> System.out.println(conta));

        //retira um elemento do ArrayList
        contas.remove(3);
        System.out.println("========================");
        System.out.println("Exibe o ArrayList de Contas:");
        contas.forEach((conta) -> System.out.println(conta));
    }
}