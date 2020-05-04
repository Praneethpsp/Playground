import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        StringBuilder temp = new StringBuilder("");
        int sb1_len = sb1.length();
        int sb2_len = sb2.length();
        for(int idx = 0; idx <= (sb1_len -1); idx++)
        {
            char ch = sb1.charAt(idx);
            temp.append(ch);     
        }
        for(int idx = 0; idx <= (sb1_len -1); idx++)
        {
            char ch = sb1.charAt(idx);
            temp.append(ch);     
        }
        int temp_len = temp.length();
        int matching= -1;
        for(int i=0;i<temp_len-sb2_len;i++)
        { 
          boolean is_matching = true;
          for(int j=0;j<sb2_len;j++)
          {
            if(temp.charAt(i+j)!=sb2.charAt(j))
            {
              is_matching=false;
              break;
            }
          }
          if(is_matching == true)
          {
            matching=i;
            break;
          }
        }
      if(matching!= -1)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}
      