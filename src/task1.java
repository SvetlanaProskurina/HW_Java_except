import java.util.Scanner;

//  Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//  Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных
public class task1 {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args){
    boolean flag = false;
      while(!flag){
        System.out.println("\nВведите число с плавающей точкой (через запятую, например: 3,5): ");
      flag = processIsFloat();
      }
  }
 public static boolean processIsFloat(){
    boolean flag = false;
    try{
      System.out.printf("Было введено число: %s", isFloat(scan));
      flag = true;
    } catch (MyExceptionNotFloatData e){
      flag = false;
      System.out.printf("%s %s\n",e.getMessage(),e.getNumber());
    }
    return flag;
 }

 static float isFloat(Scanner scan) throws MyExceptionNotFloatData {
   float number;
   String scanStr; //= null

   while(true){
     if(scan.hasNextFloat()){
       number = scan.nextFloat();
     }else{
       scanStr = scan.next();
       throw new MyExceptionNotFloatData("Введено число отличное от числа с плавающей точкой", scanStr);
     }
     return number;
   }
 }

}
abstract class MyException extends Exception{

  private final String number;

  public MyException(String message, String number) {
    super(message);
    this.number = number;
  }

  public String getNumber() {
    return number;
  }
}
class MyExceptionNotFloatData extends MyException{

  public MyExceptionNotFloatData(String message, String number) {
    super(message, number);
  }
}
