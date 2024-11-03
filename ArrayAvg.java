import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x = new Scanner(System.in);
		
		System.out.print("enter array size:");
		int n = x.nextInt();
		
		int[] numbers = new int[n];
		
		float sum =0;
		
		System.out.println("enter the array element: ");
		for(int num:numbers) {
			num = x.nextInt();
			sum += num;
		}
		
		float avg = sum/numbers.length;
		
		System.out.print(avg);
		
		
		
		

	}

}
