import java.util.Scanner;
class RemoveVowels
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string:");
String str=sc.nextLine();
String str1=str.replaceAll("[aeiouAEIOU]","");
System.out.print(str1);
}
}