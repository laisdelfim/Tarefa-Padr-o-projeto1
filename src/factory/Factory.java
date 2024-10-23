package factory;

public abstract class Factory {

  public Carro criar(String carroCriado) {
    Carro carro = criandoCar(carroCriado);
    carro = prepararCar(carro);
    return carro;
  }

  abstract Carro criandoCar(String carroCriado);

  private Carro prepararCar(Carro car) {
    car.clean();
    car.mechanicCheck();
    car.fuelCar();

    return car;
  }

  protected Carro create(Object getGradeRequest) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }
}
