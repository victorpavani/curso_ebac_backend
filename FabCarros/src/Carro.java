interface Carro {
    void exibirInfo();
}

// Implementações específicas dos produtos
class CarroSedanEconomico implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Carro Sedan Econômico");
    }
}

class CarroHatchEconomico implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Carro Hatch Econômico");
    }
}

class CarroSedanLuxo implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Carro Sedan de Luxo");
    }
}

class CarroHatchLuxo implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Carro Hatch de Luxo");
    }
}