import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		// Type your code here
      int year;
      year=sc.nextInt();
      boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
               if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println("Leap year");
        else
            System.out.println("Non Leap year");
    }
}
    