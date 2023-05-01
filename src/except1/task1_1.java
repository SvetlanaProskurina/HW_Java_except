package except1;

public class task1_1 {

  public static void main(String[] args) {

    task11();

    }

    static  void task11(){
    try{
      int[] res = getSumArray(new int[]{-1,2,5,0,1}, new int[]{4,3,5,6});
      for (int e: res){
        System.out.printf("%d\t", e);
      }
      System.out.println();
    }catch (CustomArraySizeException e){
      System.out.println(e.getMessage());
      System.out.printf("Длина первого массива: %d\nДлина второго массива: %d\n",
          e.getLen1(),e.getLen2());
    }

  }
  static int[] getSumArray(int[] arr1, int[] arr2){
    if(arr1 == null || arr2 == null)
      throw new NullPointerException("оба массива должны существовать");

    if(arr1.length != arr2.length)
      throw new CustomArraySizeException("Количество элементов в массиве должно быть одинаковым", arr1.length, arr2.length);

    int[] res = new int[arr2.length];
    for (int i = 0; i < arr1.length; i++) {
      res[i] = arr1[i] + arr2[i];
    }
    return res;
  }

  static class CustomArraySizeException extends RuntimeException{
    private int len1;
    private int len2;

    public int getLen1() {
      return len1;
    }

    public int getLen2() {
      return len2;
    }

    public CustomArraySizeException(String message, int len1, int len2) {
      super(message);
      this.len1 = len1;
      this.len2 = len2;
    }
  }
}
