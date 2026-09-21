package training;

public class Gamesearch {
   public static void main(String[]args) {
	   String[] games = {
			   "Mario","Brickgame","Startrek"," Carrace ","Airplane game","Antartica","Kingkong","Redball","Angrybirds","minecraft","spidersoltaire",
			   
			   "candycrushsaga"};
	   
	   String search="minecraft";
	   
	   boolean found =false;
	   
	   for(int i=0; i<games.length;i++) {
		   if(games[i].equalsIgnoreCase(search)) {
			   System.out.println("YES! Found"+search+"at number"+(i+1));
			   found=true;
			   break;
		   }
	   }
	   if(found== false) {
		   System.out.println("sorry!"+"not in the box");
	   }
   }
}
