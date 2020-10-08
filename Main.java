import java.util.Scanner;
/**
 * This program populates an array with 2 spots in it. It then swaps the values so that they are in ascending order. 
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // declare a constant
    final int TWO_ELEMENTS =2;

    // creat an array with 2 spots
    int[] numbers = new int [TWO_ELEMENTS];

    // ask the user to type in two numbers
    System.out.println("Please enter the 2 values for the array");

    // put both numbers into the array using a loop
    for(int i = 0; i < TWO_ELEMENTS; i++){

      // put the user's value into the array
      numbers[i] = input.nextInt();

    }
    
    if(numbers[1] < numbers[0]){

      System.out.println("Your numbers in ascending order are " + numbers[1] + " and " + numbers[0]);
      
    }else{

      System.out.println("Your numbers in ascending order are " + numbers[0] + " and " + numbers[1]);
    }    
  }
}
