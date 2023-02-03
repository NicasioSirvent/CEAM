//java class that calculates the volume of a cube from one of its side continously until user enters zero.

// The program works fine but I want to know how can I make it work with a do-while loop
// instead of a while loop? Thanks in advance!

import java.util.Scanner;

public class VolumenCuboGPT {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the side of the cube or 0 to exit: ");
    double side = input.nextDouble();
    while (side != 0) {
      double volume = Math.pow(side, 3);
      System.out.printf("The volume of the cube is %f", volume);
      System.out.println("Enter the side of the cube or 0 to exit: ");
      side = input.nextDouble();
    }
    input.close();  //GPT no añadio esto!
  }
}
// end class CubeVolume