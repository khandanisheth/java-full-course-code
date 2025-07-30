//import javafx.geometry.Side;

class info {
    private String name;
    private int id;
    static int Sid;
    static String Sname;

    static void showst()// Static fun
    {
        Sid = 52;
        Sname = "static fun ";
        System.out.println(" \n Static Id var fun()=>" + Sid);
        System.out.println(" \n Static name var fun()=>" + Sname);
    }

    info()// constector fun() direct call
    {
        this(55, "this keyword");
        Sid = 52;
        Sname = "static fun ";
        System.out.println(" \n Static Id var constector fun()=>" + Sid);
        System.out.println(" \n Static name var constector fun()=>" + Sname);
    }

    info(int idcon, String namecon)// constector fun()with argument direct call
    {
        // idcon=52;
        // namecon="static fun ";
        System.out.println(" \n Static Id var constector fun() with this block=>" + idcon);
        System.out.println(" \n Static name var constector fun() =>" + namecon);
    }

    static {// static block direct call
        Sid = 52;
        Sname = "static fun";
        System.out.println(" \n Static Id var static block()=>" + Sid);
        System.out.println(" \n Static name var static block()=>" + Sname);
    }

    void setshow(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getshow() {
        return id;
    }

    String getshowString() {
        return name;
    }

    void display() {
        System.out.println(" Super Keyword");
    }
}

// class call and Extends and super key word

class real extends info {

    void display() {
        System.out.println("Un Super Keyword");
    }

    void printMsg() {
        display();
        super.setshow(8888, "Fun() Super Keyword");
        System.out.println(super.getshow());
        System.out.println(super.getshowString());
        super.display();
    }
}

abstract class abclass {
    abstract void setshow(int id, String name);

    abstract void makeSound();
}

class absen extends abclass {
    void setshow(int id, String name) {
        System.out.println("Int var Abstrect =>" + id + "String ABSTRECT Var =>" + name);
    }

    void makeSound() {
        System.out.println(" jsgfgdgdgiohreiogzdlkvcbcvxmnfzJAKflASlzdjgd");
    }
}

public class Op_28_Staticmore {
    public static void main(String[] args) {
        info.Sid = 520;// static var
        info.Sname = "Static";// static var
        System.out.println(" \n Static Id var =>" + info.Sid);
        System.out.println(" \n Static name var =>" + info.Sname);
        info.showst();
        real obj = new real();
        obj.printMsg();

        absen se = new absen();
        se.setshow(6375, "Rh");
        se.makeSound();
    }
}