
package view;

import java.util.Scanner;


public class Validation {
    Scanner in = new Scanner(System.in);

  
     public  String checkInputString() {
        while (true) {
            String result = in.nextLine();
            if (result.length() == 0) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }
}
