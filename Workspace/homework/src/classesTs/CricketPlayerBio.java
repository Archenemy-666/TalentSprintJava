package classesTs;

import java.text.DecimalFormat;

public class CricketPlayerBio {
	private int  id ;
	private int RunsScored ;
	private int Centuries;
	private int HalfCenturies;
	private int BallsFaced ; 
	private int Sixes ;
	private int Fours ;
	private float StrikeRate ;
	private int RunsScoredInBoundaries ; 
	private static int idgen = 101 ; 
	
	
	public CricketPlayerBio() {
		id = idgen++ ;  
	}
	public CricketPlayerBio(int RunsScored , int Centuries ,int  HalfCenturies ,int  BallsFaced , int Sixes , int Fours  ) {
		this();
		this.RunsScored = RunsScored;
		this.Centuries = Centuries; 
	    this.HalfCenturies = HalfCenturies ;
		this.BallsFaced = BallsFaced ; 
	    this.Sixes = Sixes;
	    this.Fours = Fours ;
	    
	}
	
	public void setId(int id ) {
		this.id = id ;
	}
	
	public int getId() {
		return this.id ;
	}
	public void setRunsScored(int RunsScored){
		this.RunsScored = RunsScored ;
		
	}
	public int getRunsScored() {
		return this.RunsScored;
	}
	
	
	
	public void setCenturies(int Centuries){
		this.Centuries = Centuries;
		
	}
	public int getCenturies() {
		return this.Centuries;
	}
	
	
	
	
	public void setHalfCenturies(int HalfCenturies){
		this.HalfCenturies = HalfCenturies ;
		
	}
	public int getHalfCenturies() {
		return HalfCenturies;
	}
	
	
	
	public void setBallsFaced(int BallsFaced){
		this.BallsFaced = BallsFaced ;
		
	}
	public int getBallsFaced() {
		return this.BallsFaced;
	}
	
	
	
	public void setSixes(int Sixes){
		this.Sixes = Sixes ;
		
	}
	public int getSixes() {
		return this.BallsFaced;
	}
	
	public void setFours(int Fours){
		this.Fours = Fours ;
		
	}
	public int getFours() {
		return this.Fours;
	}
	
/// 
	
	public int RunsScoredInBoundaries() {
		return (this.Fours * 4) + (this.Sixes * 6) ;
	}
	public float getStrikeRate() {
		StrikeRate = (float)(RunsScored * 100) / BallsFaced ;
		DecimalFormat d = new DecimalFormat("#0.00");
		String s = d.format(this.StrikeRate);
		return Float.parseFloat(s);
		

		
		
	}
	
	public static CricketPlayerBio max(CricketPlayerBio player1 , CricketPlayerBio  player2 ) {
		if(player1.getStrikeRate() > player2.getStrikeRate()) {
			return player1 ;
		}
		else {
			return player2 ; 
		}
	}
	
///  
	public String toString() {
		return  "id : "+this.id+" | RunsScored " +this.RunsScored +"| Centuries "+this.Centuries +"| HalfCenturies "+this.HalfCenturies +
				"| BallsFaced "+this.BallsFaced + "| Sixes "+ this.Sixes +"! Fours "+this.Fours+"| get strike rate : "+getStrikeRate();
	}
	
}
