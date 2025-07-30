package Exception;

public class E_11_CustomException extends Exception {  // Abstract hata diya
    public E_11_CustomException() {
       // super();
    }

    @Override
    public String toString() {
        return "You don't have enough money";
    }
}
