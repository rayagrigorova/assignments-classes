package classes;

public class prisonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prisoner bubba = new Prisoner();
		Prisoner twitch = new Prisoner();
		
		System.out.println(bubba);
		System.out.println(twitch);
		
		System.out.println(bubba == twitch);
		System.out.println(bubba.name);
		
		bubba = twitch;
		
		bubba.name = "Bubba";
		twitch.name = "Twitch";
		
		System.out.println(bubba.name);
		
	}

}
