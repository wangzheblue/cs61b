public class methodLearn{
  public static int max(int x, int y){
    if (x < y) {
      return y;
    }
    return x;
  }

  public static void main(String[] args){
    System.out.println(max(10, 20));
  }
}
