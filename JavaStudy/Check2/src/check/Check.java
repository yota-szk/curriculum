package check;

	import constants.Constants;



public class Check {

	private static String firstName = "Suzuki";
	private static String lastName = "Yota";



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		printName(firstName, lastName);

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);


		pet.introduce();

		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_R2D2);

		robotpet.introduce();



	}

	private static void printName (String fName, String lName) {
		System.out.println("printNameメソッド → " + fName + lName );
	}

}

