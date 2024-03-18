public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João da Silva", 12345678900L);
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa ABC", 12345678901234L);

        System.out.println("Pessoa física:");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("CPF: " + pessoaFisica.getCpf());

        System.out.println("\nPessoa jurídica:");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
    }
}