
import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size= sc.nextInt();
      int arr[] = new int[arr_size];
      int z[] = new int[arr_size];
      int nz[] = new int[arr_size];
      int z_size=0,nz_size=0;
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i]>0)
        {
          nz[nz_size]=arr[i];
          nz_size++; 
        }
        else
        {
          z[z_size]=arr[i];
          z_size++;
        }
      }
      int arr_idx=0;
      for(int i=0;i<nz_size;i++)
      {
        arr[arr_idx]=nz[i];
        arr_idx++;
      }
      for(int i=0;i<z_size;i++)
      {
        arr[arr_idx]=z[i];
        arr_idx++;
      }
      for(int i=0;i<arr_size;i++)
      {
        System.out.print(arr[i]+" ");
      }
      
    }
}