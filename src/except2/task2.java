package except2;

import java.util.Random;


public class task2 {
public static void main(String[] args){
  Random random = new Random();
  int[] intArray = new int[random.nextInt(2) + 9];
  for (int i = 0; i < intArray.length; i++) {
    intArray[i] = random.nextInt(50);
  }
  try {
    int d = random.nextInt(3);
    double catchedRes1 = intArray[8] / d;
    System.out.println("catchedRes1 = " + catchedRes1);
  } catch (ArithmeticException e) {
    System.out.println("Catching exception: " + e);
  }

}
}
