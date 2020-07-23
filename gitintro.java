import java.util.*;
import java.lang.*;
public class Solution
{
   public static void main(String args[])
   {
      int fact=1;
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->1)
      {
         fact=fact*t;
      }
      System.out.println(fact);
}
}