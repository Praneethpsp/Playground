import java.util.Scanner;
class Main
{
   public static int sum_of_num(int m)
   {
      if(m==0)
      {
        return m;
      }
     else
       return((m*(m+1))/2);
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int out= sum_of_num(n);
     System.out.println(out); //result printed here
   }
}
