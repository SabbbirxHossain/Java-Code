

public class FindAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		
		float sum =0;
		
		for(int i: a)
		{
			sum +=i;
		}
		
		float x = sum/10;
		System.out.println("sum is " + x);

	}

}
