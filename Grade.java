import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x = new Scanner(System.in);
		
		System.out.print("enter the student mark: ");
		int mark = x.nextInt();
		String Grade;
		
		switch(mark/10) {
		case 10:
		case 9 :
		case 8 :
			Grade = "A+";
			break;
		case 7:
			Grade = "A";
			break;
		case 6:
			Grade = "B+";
			break;
		case 5:
			Grade = "B";
			break;
		case 4 :
			Grade = "C";
			break;
		case 3 :
			if(mark >32) {
				Grade = "D";
				break;
				}
		default:
			Grade = "F";
			
		}
		
		System.out.print("The grade of the student is " + Grade);
		
		

	}

}
