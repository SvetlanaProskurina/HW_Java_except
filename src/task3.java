public class task3 {
public static void main(String[] args) throws Exception{
    try {
      printSum(23, null);

      int a = 90;
      int b = 20;
      System.out.println(a / b);


      int[] abc = {1, 2};
      abc[3] = 9;
    } catch (NullPointerException ex) {
      System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
      System.out.println("Массив выходит за пределы своего размера!");
    } catch (Exception ex) {
      System.out.println("Что-то пошло не так...");
  }

}
private static void printSum(Integer a, Integer b) {
    System.out.println(a + b);
  }
}
