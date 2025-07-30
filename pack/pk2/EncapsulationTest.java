package pk2;

import pk1.EncapsulationEmp;


class AAA{
    private String name;
    private int age;

    public void setdata(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String nameget()
    {
        return name;
    }
    public int ageget()
    {
        return age;
    }
}
public class EncapsulationTest{
    public static void main(String[] args) {
        EncapsulationEmp empObj = new EncapsulationEmp();
        // set data using setter method.
        empObj.setName("Rahul Rajput");
        // now get data using getter method.
        String name = empObj.getName();
        System.out.println("Name : "+ name);

       
        AAA aa=new AAA();
        aa.setdata("hhh",20);
        System.out.println(aa.nameget());
        System.out.println(aa.ageget());
      }
}
