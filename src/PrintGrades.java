import java.util.Scanner;

    public class PrintGrades {
        public static void main(String[] args) {


            int grade = 0;
            String option = " ";

            do

            {

                System.out.println("Please enter your grade: ");
                Scanner keyboard = new Scanner(System.in);
                grade = keyboard.nextInt();


                if (grade >= 97 && grade <= 100){
                    System.out.println("Your grade is A+");
                }
                else if(grade >= 94 && grade <= 96 ){
                    System.out.println("You grade is A");
                }

                else if(grade >= 90 && grade <= 93 ){
                    System.out.println("You grade is A-");
                }

                else if(grade >= 87 && grade <= 89 ){
                    System.out.println("You grade is B+");
                }

                else if(grade >= 84 && grade <= 86 ){
                    System.out.println("You grade is B");
                }

                else if(grade >= 80 && grade <= 83 ){
                    System.out.println("You grade is B-");
                }

                else if(grade >= 77 && grade <= 79 ){
                    System.out.println("You grade is C+");
                }

                else if(grade >= 74 && grade <= 76 ){
                    System.out.println("You grade is C");
                }

                else if(grade >= 70 && grade <= 73 ){
                    System.out.println("You grade is C-");
                }

                else if(grade >= 60 && grade <= 69 ){
                    System.out.println("You grade is D");
                }

                else {
                    System.out.println("Go Back to school");
                }

                // condition for "while loop"
                System.out.println("Do you want enter another score? (Y/N)");
                option = keyboard.next();

            } while (option.equalsIgnoreCase("Y"));
        }
    }

