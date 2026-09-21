package training;

public class Roblox {
	public static void main(String[]args) {
		String[] games = {
				"Mario"," Brickgame","Startrek","Carrace","Aeroplane","Antartica","Kingkong","Redball","Angrybirds","Minecraft"," Spider soltaire","Candy crushsaga",
				"Roblox"
		};
		 String search= "roblox";
		 
		 boolean found = false;
		 for(int i=0; i<games.length;i++) {
			 if(games[i].equalsIgnoreCase(search)) {
				 System.out.println("YES!found"+ search+"at number"+ (i+1));
				 found = true ;
				 break;
			 }
		 }
		 if (found== false) {
			 System.out.println("sorry!"+ search+ "not in the box");
		 }
	}

}
