
public class SmurfRunner {
	public static void main(String[] args) {
		
		Smurf handy = new Smurf("handy");
		
		String name = handy.getName();
		System.out.println(name);
		handy.eat();
		
		Smurf papaSmurf = new Smurf("papa smurf");
		papaSmurf.getHatColor();
		papaSmurf.getName();
		papaSmurf.isGirlOrBoy();
		
		Smurf smurfette = new Smurf("smurfette");
		smurfette.getHatColor();
		smurfette.getName();
		smurfette.isGirlOrBoy();
		
	}
}
