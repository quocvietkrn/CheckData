
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import view.Validation;


public class Algorithm {
     static Validation v = new Validation();
     Scanner sc = new Scanner(System.in);
  public  String checkInputPhone() {
        while (true) {
            try {
                int phoneCheck = Integer.parseInt(sc.nextLine());
                String resultCheck = String.valueOf(phoneCheck);
                String PHONE_VALID = null;
                if (!resultCheck.matches(PHONE_VALID)) {
                    System.err.println("Phone number must be 10 digits");
                } else {
                    return resultCheck;
                }
            } catch (NumberFormatException ex) {
                System.out.print("Phone number: ");
                System.err.println("Phone number must be number");
            }
        }
    }
    
    public String  checkInputDate() {
        while (true) {
            try {
                String dateCheck = v.checkInputString();
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateCheck);
                return dateCheck;
            } catch (ParseException ex) {
                System.out.print("Date: ");
                System.err.println("Date to correct format(dd/MM/yyyy)");
            }
        }
    }
     public String checkInputEmail() {
        while (true) {
            String emailCheck = v.checkInputString();
            String EMAIL_VALID = null;
            if (!emailCheck.matches(EMAIL_VALID)) {
                System.err.println("Email must be correct format");
                System.out.print("Email: ");
            } else {
                return emailCheck;
            }
        }
    }   
}
