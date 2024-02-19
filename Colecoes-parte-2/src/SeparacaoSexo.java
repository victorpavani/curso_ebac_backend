import java.util.Scanner;

public class SeparacaoSexo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando arrays para armazenar os nomes e sexos
        String[] nomes = new String[6];
        String[] sexos = new String[6];

        // Leitura dos nomes e sexos digitados pelo usuário
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.println("Digite o sexo (M/F) para " + nomes[i] + ": ");
            sexos[i] = scanner.nextLine().toUpperCase(); // Convertendo para maiúsculas

            // Verifica se o sexo digitado é válido
            if (!sexos[i].equals("M") && !sexos[i].equals("F")) {
                System.out.println("Sexo inválido!");
                return; // Encerra o programa se o sexo for inválido
            }
        }

        // Imprimindo o resultado separando as pessoas por grupo masculino e feminino
        System.out.println("\nPessoas separadas por grupo:");

        System.out.println("\nGrupo Masculino:");
        for (int i = 0; i < 6; i++) {
            if (sexos[i].equals("M")) {
                System.out.println(nomes[i]);
            }
        }

        System.out.println("\nGrupo Feminino:");
        for (int i = 0; i < 6; i++) {
            if (sexos[i].equals("F")) {
                System.out.println(nomes[i]);
            }
        }

        scanner.close();
    }
}
