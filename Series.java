import java.util.Scanner;
import java.lang.Math;
public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter input: ");
		
		Scanner x = new Scanner(System.in);
		
		double n = x.nextDouble();
		
		for(int i=1;i<15;i++)
		{
			double  m = Math.pow(n, i) - (i*n);
			System.out.println(m + " ");
		}

	}

}
