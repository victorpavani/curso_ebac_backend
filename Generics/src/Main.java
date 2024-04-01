import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de Carros
        List<Carro> listaCarros = new ArrayList<>();

        // Adicionando carros de diferentes tipos
        listaCarros.add(new Honda("Civic"));
        listaCarros.add(new Nissan("Sentra"));
        listaCarros.add(new Porsche("911"));

        // Iterando e imprimindo os carros
        for (Carro carro : listaCarros) {
            System.out.println("Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo());
        }
    }
}