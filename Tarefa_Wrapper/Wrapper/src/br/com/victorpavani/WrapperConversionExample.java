package br.com.victorpavani;
import java.util.Scanner;

public class WrapperConversionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê um valor numérico do console
        System.out.print("Digite um número inteiro: ");
        int valorPrimitivo = scanner.nextInt();

        // Converte o valor primitivo em um tipo wrapper Integer
        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        // Imprime o valor wrapper no console
        System.out.println("Valor em formato Wrapper (Integer): " + valorWrapper);

        scanner.close();
    }
}

