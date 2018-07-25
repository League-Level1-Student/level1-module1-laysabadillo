
public class duckLauncher {

	public static void main(String[] args) {
		
		Duck daffy = new Duck(0, "garlic", "daffy");
		
		daffy.quack();
		daffy.waddle();
		daffy.numberOfFriends = 9;
		
		
		Duck donald = new Duck(13, "apples", "donald");
		
		donald.quack();
		donald.waddle();
		
		System.out.println(donald.numberOfFriends);
		System.out.println(daffy.numberOfFriends);
		
	}
}
