import java.util.Scanner;
class Main
{
   public static int square(int m)
   {
     int prod=1; 
     prod = prod*m*m;
     return prod;
   }
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int out=square(n);
     System.out.println(out); //result printed here
   }
}
