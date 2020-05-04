import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int out = bignum(n1,n2,n3);
      System.out.println(out);
	}
  public static int bignum(int a,int b,int c)
  {
    int large,big;
    if(a>b)
    {
      big=a;
      if(big > c)
      {
        large=big;
      }
      else
      {
        large=c;
      }
    }
    else
    {
      big=b;
      if(big > c)
      {
        large=big;
      }
      else
      {
        large=c;
      }
    }
    return large;
  }
}