public class maxInArray {
   public static int max(int[] m) {
       int maxNum = m[0];
       for (int i=1; i<m.length; i++){
         if (maxNum < m[i]){
           maxNum = m[i];
         }
       }
       return maxNum;
   }

   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
      System.out.println(max(numbers));
   }
}
