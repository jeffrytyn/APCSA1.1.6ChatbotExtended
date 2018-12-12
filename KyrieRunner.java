import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
/**
 * Write a description of class KyrieRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KyrieRunner
{
   public static void main(String[] args)
    {
        Kyrie kyrie = new Kyrie();
        System.out.println (kyrie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();
        while (!statement.equals("Bye"))
        {
          if(kyrie.findKeyword(statement.toLowerCase(), "my name is") >= 0){
             int psn = kyrie.findKeyword(statement.toLowerCase(), "my name is") + 10;
             System.out.println("Hi" + statement.substring(psn) + ", would you like to join the Flat Earth Society (Y/N)?");
             statement = in.nextLine();
            if(statement.equals("Y")){
              System.out.println("Great! People like us question tradition. Would you be willing to give us your credit card number (Y/N)?");
              statement = in.nextLine();
              if(statement.equals("Y")){
               System.out.println("Amazing! Please type in your card's number, expiration date, and security code.");
               statement = in.nextLine();
               while(tryParse(statement) == null){
                   System.out.println("Enter your card number please");
                   statement = in.nextLine();
                }
               System.out.println("Thank you for subscribing to the Flat Earth Society!");
               statement = in.nextLine();
              }else{
                 System.out.println("Ok that's fine have a good day."); 
                }
             }else{
                 System.out.println("Ok that's fine have a good day."); 
                }
            }
          
            else{
            System.out.println (kyrie.getResponse(statement));
            statement = in.nextLine();
          } 
       }
          
    }
    
   public static String tryParse(String statement) {
        String response = ""; 
        try{    
           int statement1 = Integer.parseInt(statement);
           if(statement1 != 0){
                 response = "Thank you! You are now a subscriber to the Flat Earth Society.";
                 return response;
                }
               }catch (NumberFormatException e){
                  return null;
                }
         return response;
    }
}
