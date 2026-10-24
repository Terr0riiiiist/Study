package basic;

import java.util.Scanner;

public class Demo2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
        System.out.println("Type Your figuer here");
        int Seconds = input.nextInt();
        int Hours = Seconds /3600 ;
        int Minutes = Seconds % 3600 / 60 ;
        int Secondsleft = Seconds % 60;
        System.out.print("Hours =" + Hours+","+"Minutes =" + Minutes+ ","+"Seconds =" +Secondsleft);

    }
}
