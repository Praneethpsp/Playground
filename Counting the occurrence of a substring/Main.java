import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc= new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    boolean is_substring=true;
    int len1 = str1.length();
    int len2 = str2.length();
    int count=0;
    for(int i=0;i<len1-len2+1;i++)
    {
      is_substring=true;
      for(int j=0;j<len2;j++)
      {
        if(str1.charAt(i+j)!=str2.charAt(j))
        {
          is_substring=false;
          break;
        }
      }
      if(is_substring==true)
        count++;
    }
    System.out.println(count);
  } 
}