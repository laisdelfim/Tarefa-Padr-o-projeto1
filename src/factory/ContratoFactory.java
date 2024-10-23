package factory;

public class ContratoFactory extends Factory {

  private Object requestedGrade;

  @Override
  Carro criandoCar(String carroCriado) {
    if ("A".equals(requestedGrade)) {
      return new Toyota(100, "gasulina", "preto");
    } else if ("B".equals(requestedGrade)) {
      return new Volkswagen(500, "alcoo", "branco");
    } else {
      return null;
    }

  }

}