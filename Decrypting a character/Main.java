import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int key = sc.nextInt();
        if(ch >= 'a' && ch <= 'z'){
            ch = (char)(ch - key);
            if(ch < 'a'){
                ch = (char)(ch + 26);
            }
        }
        else if(ch >= 'A' && ch <= 'Z'){
            ch = (char)(ch - key);
            if(ch < 'A'){
                ch = (char)(ch + 26);
            }
        }
        System.out.print(ch);
    }
}