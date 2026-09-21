package training;

public class GamesArray {
  public static void main(String[]args) {
	  String[]games = {
			  "Mario","Brickgame","Startrek","Car race","Aeroplane game","Antartica","Kingkong","Redball",
			  "Angry birds","Minecraft","Spider soltaire" ,"Candy crushsaga"
	  };
	  System.out.println("my 64 in 1 style games box"+games.length+"games:");
	  for(int i=0; i<games.length;i++) {
		  System.out.println (i+1 +"."+games[i]);
	  }
	  System.out.println("Array is super easy!");
  }
}
