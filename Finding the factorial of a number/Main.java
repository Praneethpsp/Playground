import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int facto=1;
      facto = fact(num);
      System.out.println(facto);
    }
      public static int fact(int n)
      {
        if(n==0)
          return 1;
        else
        {
          return (n*fact(n-1));
        }    
      }
    
}