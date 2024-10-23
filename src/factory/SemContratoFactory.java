package factory;

public class SemContratoFactory extends Factory {

  private static final Object requestedGrade = null;

  @Override
  Carro criandoCar(String carroCriado) {
    if ("A".equals(requestedGrade)) {
      return new Gol(100, "alcoo", "vermelho");
    } else {
      return null;
    }
  }

}