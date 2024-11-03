import java.util.Scanner;
public class LeappYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.print("enter the year:");
		
		int year = x.nextInt();
		
		if(year % 400 == 0) {
			System.out.print(year + " is a leap year.");
		}else if(year % 100 == 0) {
			System.out.print(year + " is not a leap year.");
		}else if(year % 4 == 0) {
			System.out.print(year + " is a leap year.");
		}else{
			System.out.print(year + " is not a leap year.");
		}


	}

}
