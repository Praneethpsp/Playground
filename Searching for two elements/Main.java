import java.util.Scanner;
class Main{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
         arr[idx] = sc.nextInt();
      }
     int s1 = sc.nextInt();
     int s2 = sc.nextInt();
     int c1=0,c2=0;
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
        if(arr[idx]==s1)
        {System.out.println(idx);
          c1=c1+1;}
        if(arr[idx]==s2)
        { System.out.println(idx);
          c2=c2+1;}
      } 
     if(c1==0 || c2==0 )
       System.out.println(-1);
   }
}