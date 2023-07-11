

import java.util.Scanner;
import java.util.Random;

class Game
{
  int RandomNumber;
  int UserNumber;
  int noOfGuesses = 0;
  
  
  public Game()
  {
    Random rand = new Random();
    
    int RandNum = rand.nextInt(100);
    this.RandomNumber = RandNum;
    
    System.out.println("Random number is generated inside the memory !!!");
  }
  
  public String TakeUserInput()
  {
    Scanner user = new Scanner(System.in);
    System.out.print("Guess the number: ");
    
    
    int UserNum = user.nextInt();
    
    this.UserNumber = UserNum;
    
    System.out.println("Reading.. "+UserNumber);
    
    user.close();
    
    
    return "Process Terminated !!!";
    
    
    }

  @SuppressWarnings("resource")
public void IsCorrectNumber()
  {
    boolean []ConditionArray = {true,false};
    noOfGuesses +=1; 
   
    if (this.UserNumber == this.RandomNumber)
    {
       System.out.println("Congratulations !!! Your guess got correct !!!");
       System.out.println("Is Number Correct "+ConditionArray[0]);
     
     
       Scanner User = new Scanner(System.in);
       System.out.print("Do you want to watch your number of guesses [1-Yes],[2-No] >>> ");
       int UserChoice = User.nextInt();
      
       if (UserChoice == 1)
      {
         System.out.println("Number of guesses >>> "+noOfGuesses);
      }
     
       else if (UserChoice == 2)
      {
         System.out.println("Terminating the game....");
      }
     
       else
      {
         System.out.println("Invalid input provided by the user...");   
      }
       System.out.println("----------------------------------------------");
       System.exit(0); // Successfully terminating the function...
    }
    
    else if (this.UserNumber < this.RandomNumber)
    {
       System.out.println("Guessed number is smaller than Random Number....");
       System.out.println("Is Number Correct "+ConditionArray[1]);
       System.out.println("----------------------------------------------");
    }
    
    else if (this.UserNumber > this.RandomNumber)
    {
       System.out.println("Guessed number is greater than Random Number....");
       System.out.println("Is Number Correct "+ConditionArray[1]);
       System.out.println("----------------------------------------------");
    }
}
   
    public String Main()
    {
       
        int counter = 0;
        while (counter<=100)
        {
        
        TakeUserInput();
        IsCorrectNumber();
       }
       return "Process Terminated !!!";
    }
}

public class GuessTheNumber
{
  public static void main(String args[])
  {
     System.out.println("Guess the number ==========================================================================================");
     Game object = new Game();
     object.Main();
     System.out.println("===========================================================================================================");
    }
}