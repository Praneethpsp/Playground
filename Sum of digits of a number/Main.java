import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int p,r,sum,d1,d2,count,fin;
      p=n;
      sum=0;
      count=0;
      while(p>0)
      {
        r=p%10;
        sum=sum+r;
        p=p/10;
        count++;
      }
      System.out.println(sum);
	}
}