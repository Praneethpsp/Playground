import java.util.Scanner;
class Main{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
     int big=0;
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
         arr[idx] = sc.nextInt();
      }
      for(int idx = 0; idx < arr_size - 1; idx++)
      {
        if(arr[idx]>arr[idx+1])
        {
          if(arr[idx]>big){
          big=arr[idx];}
        }
        else
        {
          if(arr[idx+1]>big){
          big=arr[idx+1];}
        }
      }       
     System.out.println(big);
   }
}