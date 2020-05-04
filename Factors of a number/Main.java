import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    for(int count=1;count<=n;count++)
    {
    if (n%count==0)
    {
      System.out.println(count);
    }
    }  
  }
}