interface FabricaCarro {
    Carro criarCarroSedan();
    Carro criarCarroHatch();
}

// Implementações concretas da fábrica
class FabricaCarroEconomico implements FabricaCarro {
    @Override
    public Carro criarCarroSedan() {
        return new CarroSedanEconomico();
    }

    @Override
    public Carro criarCarroHatch() {
        return new CarroHatchEconomico();
    }
}

class FabricaCarroLuxo implements FabricaCarro {
    @Override
    public Carro criarCarroSedan() {
        return new CarroSedanLuxo();
    }

    @Override
    public Carro criarCarroHatch() {
        return new CarroHatchLuxo();
    }
}