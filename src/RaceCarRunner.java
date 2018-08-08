

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar Car = new RaceCar("car", 5);
		// 2. Print the RaceCar's position in the race
		System.out.print(Car.getPositionInRace());
		// 3. Crash the RaceCar
		Car.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		Car.isDamaged();
		Car.pit();
		// 5. Help the car move into first place.
		int pos = Car.getPositionInRace();
		for(int i = 1; i < pos; i++) {
			Car.overtake();	
		}
	}
}
