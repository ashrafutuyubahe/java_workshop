import java.util.Scanner;

class Numerator_checking {

    public static void main(String[] args) {

        while(true){
            var userInput = new Scanner(System.in);
        System.out.println("enter  th first number");
        var firstNumber = userInput.nextInt();
        System.out.println("Enter the second number");
        var secondNumber = userInput.nextInt();

        try {
           
                if (secondNumber==0) {
                    throw new ArithmeticException("please you second input should not be zero");    
                }
                var result = firstNumber / secondNumber;
                System.out.println(" the results  of devisin of devision is " + result);
                break;
            

            

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }

    }

        }
}
