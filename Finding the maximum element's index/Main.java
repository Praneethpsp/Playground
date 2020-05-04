import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int big=0,j=0;
    for(int i=0;i<=n-1;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        if(arr[i]>big)
        {big=arr[i];
          j=i;}
    }
    System.out.println(j);
  }
}