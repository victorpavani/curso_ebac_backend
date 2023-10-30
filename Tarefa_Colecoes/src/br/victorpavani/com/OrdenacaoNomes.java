package br.victorpavani.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoNomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os nomes separados por vírgula
        System.out.println("Digite os nomes separados por vírgula: ");
        String entradaNomes = scanner.nextLine();

        // Dividindo a entrada em nomes individuais usando a vírgula como delimitador
        String[] nomesArray = entradaNomes.split(",");

        // Criando uma lista para armazenar os nomes
        List<String> nomes = new ArrayList<>();

        // Adicionando os nomes à lista
        for (String nome : nomesArray) {
            nomes.add(nome.trim()); // Remove espaços em branco ao redor dos nomes
        }

        // Ordenando os nomes em ordem alfabética
        Collections.sort(nomes);

        // Imprimindo os nomes ordenados
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
