import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int a,d1,d2,sum;
      a=sc.nextInt();
      d1=a/10;
      d2=a%10;
      sum=d1+d2;
      System.out.println(sum);
	}
}