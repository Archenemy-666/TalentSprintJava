package classesTs;

public class CricketDemo {
	public static void main(String[] args) {
		CricketPlayerBio player1 = new CricketPlayerBio(400 , 4 ,8 ,298 , 32 , 10);
		CricketPlayerBio player2 = new CricketPlayerBio(1100 , 5 , 10 , 443 , 12 , 21 );
		CricketPlayerBio player3 = new CricketPlayerBio(100 , 0 , 0 , 112 , 1 , 4 );
		
		System.out.println(player1.toString());
		System.out.println(player2.toString());
		System.out.println("runs scored in boundries : "+player1.RunsScoredInBoundaries());
		
		System.out.println("Strike rate to 2 decimals "+ player1.getStrikeRate());
		
		CricketPlayerBio player = CricketPlayerBio.max(player1 , player2);
		player = CricketPlayerBio.max(player , player2);
		
		System.out.println(player);
		
	}
	
}
