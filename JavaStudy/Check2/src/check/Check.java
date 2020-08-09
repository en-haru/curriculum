package check;




import constants.Constants;


public class Check {
	private static String firstName = "endo";
	private static String lastName = "haruya";
	private static void printName(String firstname, String lastname){
		System.out.println("printNameメソッド→" + firstname + lastname);
	}

	
	public static void main(String[] args) { 
		
	 printName(firstName, lastName);
		
	 
	
	Constants constants = new Constants();
	Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
	pet.introduce();
	
	RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
	
	robotPet.introduce();
	
	}
	

}
