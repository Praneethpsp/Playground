import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++)
    {
     int temp=0;
    for(int j=2;j<=i-1;j++)
    {
      if(i%j==0)
        temp=temp+1;
    }
      if(temp==0 && i>1)
        System.out.println(i);
    }
  }
}