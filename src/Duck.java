
public class Duck {

	int numberOfFriends = 0;
	String favoriteFood = "";
	String name = "";
	
	
	public void quack() {
		System.out.println(this.name + " says Quack!");
	}
	public void waddle() {
		System.out.println("waddle");
	}
	public Duck (int numberOfFriends, String favoriteFood, String name) {
		this.numberOfFriends = numberOfFriends;
		this.favoriteFood = favoriteFood;
		this.name = name;
		
		System.out.println(this.name + " was created");
	}
	
}
