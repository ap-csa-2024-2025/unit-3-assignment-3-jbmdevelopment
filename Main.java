import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // TODO: Problem 1
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer");
    int int1 = input.nextInt();
    System.out.println("Enter another integer");
    int int2 = input.nextInt();
    if(int2 == 0) {
        int num = (int)(Math.random() * 10) + 1;
        System.out.println("Cannot divide by zero auto chosen number to " + num);
    } else {
        final double ratio = int1 / int2;
        if(ratio > 1 && ratio <= 8) {
            System.out.println("Ratio OK");
        } else {
          System.out.println("This ratio is terrible");
        }
    }

    // TODO: Problem 2
    System.out.println("Give an integer");
    int num1 = input.nextInt();
    System.out.println("Give another integer");
    int num2 = input.nextInt();
    if(num2 == 0) {
        int num = (int)(Math.random() * 1000) + 1;
        System.out.println("Cannot divide by zero auto chosen number to " + num);
    } else {
      if(num1 % num2 == 0) {
          System.out.println("Is a factor");
      } else {
        System.out.println("Is not a factor");
      }
    }
    // TODO: Problem 3
    System.out.println("Enter an integer in the fifties");
    int another = input.nextInt();
    if(another < 50 || another > 59) {
        System.out.println("That's not in the fifties!");
    }
    System.out.println("Your number is " + another);
    System.out.println("Enter an int");
    int x = input.nextInt();
    System.out.println("Enter another integer");
    int y = input.nextInt();
    if(y <= 9 || !(x <= 2 && x * y < 10)) {
        System.out.println("pass");
    }
    
    // warm up
    Rectangle r1 = new Rectangle(5, 10);
    Rectangle r2 = new Rectangle(5, 10);
    boolean isEqual = rectEqual(r1, r2);
  }

  // TODO: In-class assignment
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise.  Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal.
  public static boolean rectEqual(Rectangle r1, Rectangle r2)
  {
    // implement solution here
    return r1.getWidth() == r2.getWidth() && r1.getLength() == r2.getLength();
  }
}
