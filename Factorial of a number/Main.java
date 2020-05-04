import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int fact=1;
    for(int count=n;count>=1;count--)
    {
      fact=fact*count;
    }
    System.out.println(fact);
     }  
  }
