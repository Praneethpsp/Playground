import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int a,first,third,add;
      a=sc.nextInt();
      first=a/100;
      third=a%10;
      add=first+third;
      System.out.println(add);
	}
}