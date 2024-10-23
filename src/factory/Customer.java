package factory;

public class Customer {
  private String gradeRequest;
  private boolean hasCompanyContract;
  public Object getGradeRequest;

  public Customer(String string, boolean b) {
    // TODO Auto-generated constructor stub
  }

  public void Customer(String gradeRequest, boolean hasCompanyContract) {
    this.gradeRequest = gradeRequest;
    this.hasCompanyContract = hasCompanyContract;
  }

  public String getGradeRequest() {
    return gradeRequest;
  }

  public boolean hasCompanyContract() {
    return hasCompanyContract;
  }

}
