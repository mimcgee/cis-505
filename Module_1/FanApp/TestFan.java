/*  
    Author:  Mike McGee
    Fan Test Class - tests Fan objects (e.g., table fan)
    02 September 2021
    References:
    CIS 505 Intermediate Java Programming. Bellevue University.
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
    Chapter 9
*/

public class TestFan {  
  public static void main(String[] args) {

    Fan fan1 = new Fan();
    Fan fan2= new Fan(true,Fan.FAST,15.0,"Red");
    
    System.out.println(fan1.toString());
    System.out.println(fan2.toString());
  }
}
