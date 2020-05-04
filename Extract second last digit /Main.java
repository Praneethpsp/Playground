import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int a,s1,s2;
      a=sc.nextInt();
      s1=a/10;
      s2=s1%10;
      System.out.println(s2);
	}
}