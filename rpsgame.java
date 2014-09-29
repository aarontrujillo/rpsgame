import java.util.Scanner; 
import java.util.Random; 


public class rpsgame 
{ 
public static void main(String[] args) 
{ 
    String personPlay; 
    String computerPlay = ""; 
    
    Scanner input = new Scanner(System.in); 
    Random generator = new Random();
    int computerInt = generator.nextInt(3)+1;
    String response; 

    System.out.println("Rock, Paper, Scissors!\n" + 
                       "Enter a move.\n" + "Rock = R, Paper" + 
                       "= P, and Scissors = S.");

    if (computerInt == 1) 
       computerPlay = "R"; 
    else if (computerInt == 2) 
       computerPlay = "P"; 
    else if (computerInt == 3) 
       computerPlay = "S"; 

    System.out.println("Enter : "); 
    personPlay = input.next();

    System.out.println("Computer play is: " + computerPlay); 


  if (personPlay.equals(computerPlay)) {
      System.out.println("It's a tie!");
   }
   else if (personPlay.equals("R")) {
      if (computerPlay.equals("S")) 
         System.out.println("Rock crushes scissors. You win!!");
      else if (computerPlay.equals("P")) 
           System.out.println("Paper eats rock. You lose!!");
   }
   else if (personPlay.equals("P")) {
       if (computerPlay.equals("S")) 
       System.out.println("Scissor cuts paper. You lose!!"); 
    else if (computerPlay.equals("R")) 
            System.out.println("Paper eats rock. You win!!"); 
   } 
   else if (personPlay.equals("S")) {
        if (computerPlay.equals("P")) 
            System.out.println("Scissor cuts paper. You win!!"); 
        else if (computerPlay.equals("R")) 
           System.out.println("Rock breaks scissors. You lose!!");
   }
 
}
}
// Good ...please comments to explain code/logic
