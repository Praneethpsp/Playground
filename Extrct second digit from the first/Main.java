import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int p,sum,d1,d2,count,fin;
      p=n;
      sum=0;
      count=0;
      while(p>0)
      {
        p=p/10;
        count++;
      }
      fin = (int)Math.pow(10, count-2);
      d1=n/fin;
      d2=d1%10;
      System.out.println(d2);
	}
}