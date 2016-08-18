public class LeapYear{
  public static void main(String[] args){
    int year = 2000;
    String isLeapYear = year + " is a Leap Year.";
    String notLeapYear = year + " is not a Leap Year.";
    if (year % 400 == 0){
      System.out.println(isLeapYear);
    }
    else if (year % 4 == 0 && year % 100 != 0){
      System.out.println(isLeapYear);
    }
    else {
      System.out.println(notLeapYear);
    }
  }
}
