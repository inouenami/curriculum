package check;

public class Main {

	/**
	 * 課題1
	 * フィールド変数firstNameとlastNameを宣言,自分の名前で初期化
	 */
	private static String firstName ="井上";
	private static String lastName ="奈美";
	/**
	 * 課題2
	 * firstNameとlastNameを引数で受け取って、連結して表示させるメソッド
	 * @param firstName
	 * @param lastName
	 */
	private static void printName(String firstName, String lastName){
		System.out.println("printNameメソッド→"+ firstName + lastName);
	};

	/**
	 * PetクラスとRobotPetクラスをインスタンス化し、出力
	 * @param args
	 */
	public static void main(String[] args) {

		Main.printName(firstName,lastName);

		Pet pet = new Pet(constants.Constants.CHECK_CLASS_JAVA,constants.Constants.CHECK_CLASS_HOGE);

		pet.introduce();

		RobotPet robotPet = new RobotPet(constants.Constants.CHECK_CLASS_R2D2,constants.Constants.CHECK_CLASS_LUKE);

		robotPet.introduce();


	}

}
