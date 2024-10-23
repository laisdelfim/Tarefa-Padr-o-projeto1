package factory;

public class Demo {
  public static void main(String[] args) {
    Customer cliente = new Customer("A", false);
    Factory factory = getFactory(cliente);
    Carro car = factory.create(cliente.getGradeRequest());
    car.startEngine();
  }

  private static Factory getFactory(Customer cliente) {
    if (cliente.hasCompanyContract()) {
      return new ContratoFactory();
    } else {
      return new SemContratoFactory();
    }
  }
}
