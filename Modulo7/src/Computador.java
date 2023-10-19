public class Computador {
    // Propriedades
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double capacidadeArmazenamentoGB;

    // Construtor
    public Computador(String marca, String modelo, int anoFabricacao, double capacidadeArmazenamentoGB) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.capacidadeArmazenamentoGB = capacidadeArmazenamentoGB;
    }

    // Método para ligar o computador
    public void ligar() {
        System.out.println("O computador está ligando...");
    }

    // Método para desligar o computador
    public void desligar() {
        System.out.println("O computador está desligando...");
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Computador
        Computador meuComputador = new Computador("Dell", "Inspiron 15", 2022, 512);
        meuComputador.ligar();
        meuComputador.desligar();
    }
}