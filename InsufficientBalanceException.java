package bankdemo;

//Custom Exception
public class InsufficientBalanceException extends Exception {

 public InsufficientBalanceException(String message) {
     super(message);
 }
}
