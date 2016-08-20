public class Triangle {
   public static void main(String[] args) {
     drawTriangle(10);
   }

   public static void drawTriangle(int N) {
     int line = 1;
     while (line <= N){
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
