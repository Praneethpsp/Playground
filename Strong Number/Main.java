import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int last;
    int sum=0;
    int temp=n;
    while(temp>0)
    {
    last=temp%10;
      int fact=1,count=1;
      while(count<=last)
      {
        fact=fact*count;
        count++;
      }
      sum=sum+fact;
      temp=temp/10;
    }
    if(sum==n)
    {
      System.out.println("Yes");
    }  
    else
      {
      System.out.println("No");
    } 
  }
}
