class Teacher{
	String name;
}

class Sabbir{
	String name,gender,address;
	
	void SetInformation(String n, String g, String a){
		name = n;
		gender = g;
		address = a;
	}
	
	void InformationDisplay() {
		System.out.println(name);
	    System.out.println(gender);
	    System.out.println(address);
	}
}



public class ClassesAndObjects {
	  public static void main(String[] args) {

	    Sabbir info = new Sabbir();
	    
	    info.SetInformation("Sanmoon Rahman","Male","Gazipur");
	    info.InformationDisplay();
	   
	    
	  }
	}