public class Main {
    public static void main(String[] args) {
        FabricaCarro fabricaEconomico = new FabricaCarroEconomico();
        FabricaCarro fabricaLuxo = new FabricaCarroLuxo();

        Carro sedanEconomico = fabricaEconomico.criarCarroSedan();
        Carro hatchEconomico = fabricaEconomico.criarCarroHatch();
        Carro sedanLuxo = fabricaLuxo.criarCarroSedan();
        Carro hatchLuxo = fabricaLuxo.criarCarroHatch();

        sedanEconomico.exibirInfo();
        hatchEconomico.exibirInfo();
        sedanLuxo.exibirInfo();
        hatchLuxo.exibirInfo();
    }
}