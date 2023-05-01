package except1;

import java.util.Random;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//    каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
//    необходимо как-то оповестить пользователя.
//    * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, к
//    аждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
//    необходимо как-то оповестить пользователя.
//    Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
public class task2 {
  static Random random = new Random();
//  static Random random2 = new Random();
  public static void main(String[] args) {

    int[] divmassive = divMassive();

    System.out.print("divmassive: ");
    for (int i = 0; i < divmassive.length; i++) {
      System.out.printf("%d\t", divmassive[i]);
    }
  }

  static void process(int[] massive1, int[] massive2) {
//    if (massive1 == null || massive2 == null) {
//      throw new RuntimeException(
//          "The array is incorrectly initialized"); // Массив некорректно проинициализирован
//    }
    if (massive1.length != massive2.length)
      throw new RuntimeException("Array lengths are different"); // длины массивов разные

    System.out.print("massive1: ");
    for (int i = 0; i < massive1.length; i++) {
        massive1[i] = random.nextInt(10);
        System.out.printf("%d\t", massive1[i]);
    }
      System.out.println();

      System.out.print("massive2: ");
      for (int i = 0; i < massive2.length; i++) {
        massive2[i] = random.nextInt(10);
        System.out.printf("%d\t", massive2[i]);
      }
      System.out.println();

    for (int i = 0; i < massive2.length; i++) {
      if(massive2[i] == 0) throw new RuntimeException("Divide by zero"); // длины массивов разные
    }
  }
  static int[] divMassive(){
    int[] massive1 = new int[random.nextInt(5)+1];
    int[] massive2 = new int[random.nextInt(5)+1];
    int[] divmassive = new int[massive1.length];

    process(massive1, massive2);

    for (int i = 0; i < massive1.length; i++){
      divmassive[i] = massive1[i]/massive2[i];
    }
    System.out.println("");
    return divmassive;
  }
}