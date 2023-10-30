package br.victorpavani.com;

import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;
        import java.util.Scanner;

public class SeparacaoSexos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os nomes com os sexos separados por hífen
        System.out.println("Digite os nomes com os sexos separados por hífen (Ex: Victor - M):");
        String entrada = scanner.nextLine();

        // Dividindo a entrada em nomes individuais usando a vírgula como delimitador
        String[] nomesArray = entrada.split(",");

        // Criando listas para armazenar os sexos
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        for (String nome : nomesArray) {
            String[] partes = nome.split("-");
            if (partes.length == 2) {
                String nomeCompleto = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase(); // Transforma o sexo em maiúsculo

                if (sexo.equals("M")) {
                    masculinos.add(nomeCompleto);
                } else if (sexo.equals("F")) {
                    femininos.add(nomeCompleto);
                } else {
                    System.out.println("Sexo inválido para: " + nomeCompleto);
                }
            } else {
                System.out.println("Formato inválido para: " + nome);
            }
        }

        // Imprime os nomes separados por sexo
        System.out.println("Pessoas do sexo Masculino:");
        for (String nome : masculinos) {
            System.out.println(nome);
        }

        System.out.println("\nPessoas do sexo Feminino:");
        for (String nome : femininos) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
