import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int temp=n;
    int count=0;
    int last,sum=0;
    while(temp>0)
    {
      temp=temp/10;
      count++;  
    } 
    temp=n;
    while(temp>0)
    {
    last=temp%10;    
      int f=(int)Math.pow(last,count);
      sum=sum+f;
      temp=temp/10;
    }
    if(sum==n)
    {
      System.out.println("Armstrong Number");
    }  
    else
      {
      System.out.println("Not a Armstrong Number");
    } 
  }
}
