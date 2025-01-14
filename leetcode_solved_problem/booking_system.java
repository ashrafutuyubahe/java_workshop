import java.util.Scanner;

class booking_system {

    public static void main(String[] arguments) throws Custom_invalid_age_exception {
        printTerminalMessage_checkAge();  
    } 


        

    public  static void printTerminalMessage_checkAge(){
        System.out.println("********************MOVIE TICKET BOOKING SYSTEM*****************************************");
        System.out.println(" ");

        while (true) {
            var userInput = new Scanner(System.in);

            System.out.println("Choose you actions");
            System.out.println("1.Book Your Ticket(you must be above 18 years old) ");
            System.out.println("2.See Available Tickets");
            System.out.println("3.Exit");

            var userChoice = userInput.nextInt();
            userInput.nextLine();

            try {
                if (userChoice == 1) {
                    System.out.println("Enter you age"); 
                    var userAge = userInput.nextInt();
                    if (userAge < 18) {
                        throw new Custom_invalid_age_exception(
                                "Please you are not Eligible to book because you are under 18");
                       }

                    
                } else if (userChoice == 2) {
                    System.out.println("No currents Ticket available");

                } else if (userChoice == 3) {
                    System.out.println("Goodbye");
                    break;
                }
            } catch (Custom_invalid_age_exception e) {
                System.out.println("cought an exception " + e.getMessage());

            }

        }
    }
}
