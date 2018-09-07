import java.util.Scanner;
 
class ReverseString
{
   public static void main(String args[])
   {
      String str, reverse="";
      Scanner in = new Scanner(System.in);
 
      System.out.print("Enter a string to reverse:");
      str = in.nextLine();
 
      int len = str.length();
 
      for ( int i = len - 1 ; i >= 0 ; i-- )
         reverse = reverse + str.charAt(i);
 
      System.out.println("Reverse of the string is: "+reverse);
   }
}