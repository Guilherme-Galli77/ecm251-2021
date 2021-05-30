package br.maua;

import br.maua.model.Item;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
	    File file = new File("dados.txt");
	    //Realiza a leitura do conteudo desse arquivo
        try{
            //Cria elemento para iterar pelo arquivo
            Scanner scanner = new Scanner(file);
            //Passa por todos os elmentos do arquivo
            while (scanner.hasNext()){
                String linha = scanner.nextLine();
                items.add(Item.pegaItem(linha));
            }
            //Exibiu um resumo dos dados
            exibeResumo(items);
            //Cria um arquivo com o resumo dos dados
            criarNota(items);
        }
        catch (Exception exception){
            System.out.println("Algo deu errado:");
        }
    }

    private static void criarNota(List<Item> items) throws Exception {
        FileWriter fileWriter = new FileWriter("nota.txt");
        fileWriter.write("=== Resumo Pedido ===");
        fileWriter.append("Total de items: " + items.size()+"\n");
        double total = 0;
        fileWriter.append("Items: "+"\n");
        for (Item item : items){
            fileWriter.append(item.nome+"\t"+item.preco+"\n");
            total += item.preco;
        }
        fileWriter.append("Total do pedido:" + total+"\n");
        //Fechar o arquivo!
        fileWriter.close();
    }


    private static void exibeResumo(List<Item> items) {
        System.out.println("=== Resumo Pedido ===");
        System.out.println("Total de items: " + items.size());
        double total = 0;
        System.out.println("Items: ");
        for (Item item : items){
            System.out.println(item.nome+"\t"+item.preco);
            total += item.preco;
        }
        System.out.println("Total do pedido:" + total);
        }

    }
