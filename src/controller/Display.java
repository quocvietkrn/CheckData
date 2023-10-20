
package controller;


import java.util.Scanner;
import model.Algorithm;
import model.Menu;



public class Display extends  Menu {
    private Scanner sc = new Scanner(System.in);
    Algorithm al = new Algorithm();
     //display menu
    private void menu() {
        
        System.out.println("1.Check Input Phone: ");
        System.out.println("2.Check Input Date : ");
        System.out.println("3.Check Input Email: ");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
    @Override
     public void execute() {
        int choice;
        do {
            menu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    al.checkInputPhone();
                    break;
                case 2:
                    al.checkInputDate();
                    break;
                case 3:
                    al.checkInputEmail();
                    break;              
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }
    
}
