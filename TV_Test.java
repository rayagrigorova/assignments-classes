package Classes;

public class TV_Test {

	public static void printTV(TV tv) {
		System.out.println("channel: " + tv.channel + " volume level: " + tv.volumeLevel + " is the TV on? " + tv.on);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV televizor = new TV();
		printTV(televizor);
		
		televizor.setChannel(66);
		televizor.turnOn();
		televizor.setVolume(7);
		printTV(televizor);
		
		televizor.turnOff();
		televizor.setChannel(666);
		televizor.channelUp();
		televizor.setChannel(120);
		televizor.channelUp();
		printTV(televizor);
		
	}

}
