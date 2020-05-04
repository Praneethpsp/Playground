import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int out = gcd_of_num(n1,n2,n3);
      System.out.println(out);
	}
  public static int gcd_of_num(int a,int b,int c)
  {
    int min,gcd=0,fingcd=0;
   if(a<b)
     min=a;
   else
     min=b;
   while(min>=1)
   {
     if(a%min==0 && b%min==0)
     {
       gcd=min;
       break;
     }
     min--;
   }
    if(gcd<c)
     min=gcd;
   else
     min=c;
   while(min>=1)
   {
     if(gcd%min==0 && c%min==0)
     {
       fingcd=min;
       break;
     }
     min--;
   }
    return fingcd;
  }
}