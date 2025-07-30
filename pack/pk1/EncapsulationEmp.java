package pk1;

public class EncapsulationEmp {
     /*private proerties to restrict access*/
  private String name;
  
  /*getter method to get data.*/
  public String getName() {
    return name;
  }

  /*setter method to set data.*/
  public void setName(String newName) {
    this.name = newName;
  }
}
