package br.victorpavani;
import java.util.Scanner;

import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Média: " + media);
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Média: " + media);
            System.out.println("Recuperação");
        } else {
            System.out.println("Média: " + media);
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}

