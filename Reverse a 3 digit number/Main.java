import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int n,d1,d2,d3,reverse;
    n=sc.nextInt();
	d1= n/100;
	d2 = ((n/10)%10);
	d3= n%10;
	reverse = (d3*100)+(d2*10)+d1;
    System.out.println(reverse);
    
  }
}