package training;

public class Gamefinder {
	public static void main(String[]args) {
		String[] games = { "mario", "tetris", "pacman", "roblox", "candycrush"};
		for(int i=0; i<games.length;i++) {
			if(games[i].equals("roblox")) {
				System.out.println("YES! FOUND ROBLOX AT NUMBER"+(i+1));
			}
		}
	}

}