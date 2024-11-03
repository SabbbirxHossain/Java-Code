import java.util.Scanner;
public class Citizen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		
		System.out.print("name:");
		String name = x.nextLine();
		
		System.out.print("age:");
		int age = x.nextInt();
		
		System.out.print("gender:");
		char gender = x.next().charAt(0);
		
		System.out.print("height:");
		double height = x.nextDouble();
		
		x.nextLine();
		
		System.out.print("birthplace:");
		String place = x.nextLine();
		
		System.out.print("income:");
		int income = x.nextInt();
		
		if(gender == 'm' || gender == 'M') {
			System.out.println(name + " is a male." + "his age is " + age + " his height is " + height +" His birthplace in " +
		place + " Income is " + income);
		}else {
			System.out.println(name + " is a female." + "her age is " + age + " her height is " + height +" His birthplace in " +
					place + " Income is " + income);
		}

	}

}
