import java.util.*;
public class HellloWorld{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String name = "Hello World Java Edition";
     
      System.out.println(name);
      
      for(int i = 0 ; i < name.length() ; i++){
      System.out.print("=");
       }
       
       System.out.println();
       
       char choice;
       
       do{
       char answer = 'K';
       System.out.println("I have a letter in my mind; can you guess it?");
       String guess = in.nextLine();
       answer = guess.toUpperCase().charAt(0);
       if(answer == 'K'){
       System.out.println("Your guess was damn right!");
       }
       else{
       System.out.println("your guess was wrong!");
       
       }
       System.out.println("Would you like to guess again? (Y/N)");
       String response = in.nextLine();
       choice = response.toUpperCase().charAt(0);
       }while(choice == 'Y');
      }
   }
