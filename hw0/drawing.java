public class drawing{
  public static void main(String[] args){
    int line = 1;
    while (line <= 5){
      int count = line;
      String stars = "";
      while (count > 0){
        stars = stars + "*";
        count -= 1;
      }
      System.out.println(stars);
      line += 1;
    }
  }
}
