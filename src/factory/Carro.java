package factory;

public abstract class Carro {
    int potencia;
    private String combustivel;
    private String cor;

    public Carro(int cavalos, String combustivel, String cor) {
        this.potencia = cavalos;
        this.combustivel = combustivel;
        this.cor = cor;
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName());
        System.out.println("O " + combustivel + " motor esta ligado e prontor para andar " + potencia
                + " cavlos de potencia");
    }

    public void clean() {
        System.out.println("O carro e esta lavado e " + cor.toLowerCase() + " polido");
    }

    public void mechanicCheck() {
        System.out.println("O carro foi avaliado pelo mecanico. Esta tudo ok! ");
    }

    public void fuelCar() {
        System.out.println("O carro esta sendo abastecido " + combustivel.toLowerCase());
    }

}
