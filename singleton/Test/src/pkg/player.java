package pkg;

public class player {
	private static player player1;
	
	private player() {
		
	}
	public static player getPlayer() {
		if(player1 == null) {
			player1 = new player();
			
		}
		return player1;
	}
}
