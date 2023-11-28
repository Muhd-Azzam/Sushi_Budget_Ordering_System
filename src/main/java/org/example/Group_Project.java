//package com.mycompany.group_project;
import java.util.Scanner;
/**
 *
 * @author Azzam
 */
public class Group_Project {
    static void DisplayMenu(double Budget) {
        final double Tamago_PRICE = 1;
        final double Ebi_PRICE = 2;
        final double Unagi_PRICE = 3;
        int TamagoCount = (int) (Budget / Tamago_PRICE);
        int EbiCount = (int) (Budget / Ebi_PRICE);
        int UnagiCount = (int) (Budget / Unagi_PRICE);

        if (Budget < 0) {
            System.out.println("Not enough budget");
            System.exit(0);
        } else {
            System.out.println("You can order:");
            System.out.println("Tamago x " + TamagoCount + " : RM1 each");
            System.out.println("Ebi x " + EbiCount + " : RM2 each");
            System.out.println("Unagi x " + UnagiCount + " : RM3 each");
            System.out.println("Your remaining budget is RM" + Budget);
        }
    }
    //static double Check_out (int Sushi Type, Num of Sushi, )
    public static void main(String[] args){
        //Lab_text_1
        Scanner input_num = new Scanner(System.in); //scanner for numbers
        Scanner input_text = new Scanner(System.in); // scanner for text
        Scanner input_Budget = new Scanner(System.in); // scanner to set the budget
        //multiple scanner for different input text and number
        System.out.println("Please Enter your Budget"); //
        double Budget = input_Budget.nextDouble();
        int Tamago = 0;
        int Ebi = 0;
        int Unagi = 0;
        final double Tamago_PRICE = 1;
        final double Ebi_PRICE = 2;
        final double Unagi_PRICE = 3;
        Boolean Repeat_program = true; // initialize repeat loop
        int Num_Sushi = 0;
        do{ //Repeat until Repeat_program flag is set to false
            DisplayMenu(Budget); // call method to display menu based on budget
            System.out.println("What Sushi do you want?  type 'check out' when done");
            String type = input_text.nextLine(); //text input to select room

            switch (type){ //set price based on room type
                case "Tamago" :
                case "tamago" : //Sushi1
                    System.out.println("Enter the number of  sushi you want" );
                    Num_Sushi = input_num.nextInt();  // input to set the amount of sushi
                    Budget = Budget - (Tamago_PRICE * Num_Sushi);
                    Tamago = Tamago + Num_Sushi;
                    break;
                case "Ebi" :
                case "ebi" : //Sushi2
                    System.out.println("Enter the number of  sushi you want" );
                    Num_Sushi = input_num.nextInt();  // input to set the amount of sushi
                    Budget = Budget - (Ebi_PRICE * Num_Sushi);
                    Ebi = Ebi + Num_Sushi;
                    break;
                case "Unagi" :
                case "unagi" : //Sushi3
                    System.out.println("Enter the number of  sushi you want" );
                    Num_Sushi = input_num.nextInt();  // input to set the amount of sushi
                    Budget = Budget - (Unagi_PRICE * Num_Sushi);
                    Unagi = Unagi + Num_Sushi;
                    break;
                case "CHECK OUT" :
                case "check out" : //Sushi3
                    Repeat_program = false; // End the loop
                    break;
                default:
                    System.out.println("Invalid input , please type the sushi name");
                    continue;
            }
            System.out.println("===============");
            System.out.println("Current Budget :" + Budget);

        } while (Repeat_program); // Repeat_program = false will end the loop

        double Total_Price = (Tamago*Tamago_PRICE)+(Ebi*Ebi_PRICE)+(Unagi*Unagi_PRICE);
        System.out.println("===================================");
        System.out.println(" Receipt of your orders!");
        System.out.println( "Tamago x " + Tamago + " : RM " + (Tamago*Tamago_PRICE));
        System.out.println( "Ebi x " + Ebi +" : RM " + (Ebi*Ebi_PRICE));
        System.out.println( "Unagi x " + Unagi +" : RM " + (Unagi*Unagi_PRICE));
        System.out.println("The total price is = RM " + Total_Price);
    }
}