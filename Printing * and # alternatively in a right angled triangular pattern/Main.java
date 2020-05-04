import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
      int count=0;
      for(int row=1;row<=n;row++)
      {
        for(int col=1;col<=row;col++)
        {
           count++;
          if(count%2==0)
          {
           System.out.print("#");
          }
          else
        {
           System.out.print("*");
          }
        }
         System.out.print("\n");
      }
	}
}