
public class FindAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		float sum =0;
		
		for(int num : numbers) {
			sum += num;
		}
		
		float avg = sum/numbers.length;
		
		System.out.print("The average of the number is " + avg);

	}

}
