public class LeapYear{
  public static void main(String[] args){
    String isLeapYear = Integer.parseInt(args[0]) + " is a Leap Year.";
    String notLeapYear = Integer.parseInt(args[0]) + " is not a Leap Year.";
    if (Integer.parseInt(args[0]) % 400 == 0){
      System.out.println(isLeapYear);
    }
    else if (Integer.parseInt(args[0]) % 4 == 0 && Integer.parseInt(args[0]) % 100 != 0){
      System.out.println(isLeapYear);
    }
    else {
      System.out.println(notLeapYear);
    }
  }
}
