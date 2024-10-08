import java.util.Scanner;

class InvalidAgeException extends Exception {
    //..... YOUR CODE STARTS HERE .....
     InvalidAgeException(String msg) {
        super(msg);
    
     }
    //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
    

        try {
        
        int age=scanner.nextInt();    
            if (age < 18) {
                
                throw new InvalidAgeException("Age must be 18 or older");
            } else {
                
                System.out.println("Age is valid");
            }
            } catch (InvalidAgeException e) {
           
            System.out.println(e.getMessage());
            } finally {
          
            scanner.close();
        }
    
        //..... YOUR CODE ENDS HERE .....
    }
}