//java class where You must guess a number between 1 and 20 in 5 tries.
/*
 * The problem is that I need to do it with a for loop, 
 * but I don't know how to do it, can someone help me?
 */

import java.util.Scanner; 
public class AdivinaNumeroGPT { 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    int number = (int)(Math.random() * 20); 
    System.out.println("I have chosen a number between 1 and 20." + 
        " Try to guess it."); 
    System.out.print("Your guess: "); 
    int guess = input.nextInt(); 
    if (guess == number) 
      System.out.println("That's right! Good job!"); 
    else if (guess > number) 
      System.out.println("Your guess is too high."); 
    else 
      System.out.println("Your guess is too low."); 
    
    input.close(); //GPT no añadio esto
  } 
}