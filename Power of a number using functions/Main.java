import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int exp = sc.nextInt();
    int out = power(base,exp);
    System.out.println(out);
  }
  public static int power(int b,int e)// assigning value of num to m
  {
    int value= (int)Math.pow(b,e);
    return value;
  }
}