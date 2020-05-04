import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc= new Scanner(System.in);
      int num1,num2,num3;
      num1=sc.nextInt();
      num2=sc.nextInt();
      num3=sc.nextInt();
      if(num1>num2){
      if(num1>num3){
        System.out.println(num1);}
      
       else{
       System.out.println(num3);
       }}
      else if(num2>num3)
      {
        System.out.println(num2);
      }
      else{
      System.out.println(num3);
      }
    }
}