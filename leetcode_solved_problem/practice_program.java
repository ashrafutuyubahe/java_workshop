import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;



class practice_program {

    public static void main(String[] args) {

        askUserInput();

    }

    public static void askUserInput() {

        var stud_Marks_pair = new HashMap<String, Float>();

        Float avarageMark;

        while (true) {
            try {
                System.out.println(
                        "___________________________welcome to student management system_______________________________________________");
                System.out.println(" ");

                System.out.println("what's your action");

                System.out.println("1.Add student");
                System.out.println("2.view all students");
                System.out.println("3.set the avarage marks");
                System.out.println("4.view students performance");
                System.out.println("5.Exit");

                var userInput = new Scanner(System.in);
                var userChoice = userInput.nextInt();
                userInput.nextLine();

                if (userChoice == 1) {
                    System.out.println("what is the student name");
                    var studName = userInput.nextLine();
                    System.out.println("what is the overall marks for " + studName);
                    var studMarks = userInput.nextFloat();
                    stud_Marks_pair.put(studName, studMarks);

                } else if (userChoice == 5) {
                    break;
                } else if (userChoice == 3) {
                    System.out.println("what is the avarage marks");
                    avarageMark = userInput.nextFloat();

                } else if (userChoice == 2) {
                    if (stud_Marks_pair.size() == 0) {
                        System.out.println("No students available, please add some students");
                    } else
                        for (Map.Entry<String, Float> entry : stud_Marks_pair.entrySet()) {
                            System.out.println(entry.getKey());
                        }

                } else if (userChoice == 4) {
                    if (stud_Marks_pair.size() == 0) {
                        System.out.println("No students available, please add some students");
                    } else {
                        System.out.println("students  with their marks list  with their passing status");
                        for (Map.Entry<String, Float> data : stud_Marks_pair.entrySet()) {
                            System.out.println(data.getKey() + ":" + data.getValue());
                        }
                    }
                } else {
                    System.out.println("Invalid input");

                }
            } catch (Exception e) {
                throw new InputMismatchException("invalid input");
            }

        }
    }

}