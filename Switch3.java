package training;

public class Switch3 {

	
	    public static void main(String[] args) {
	        char grade = 'B';
	        
	        // Traditional Switch with break
	        switch(grade) {
	            case 'A':
	                System.out.println("Excellent!");
	                break;
	            case 'B':
	                System.out.println("Good job!");
	                break;
	            case 'C':
	                System.out.println("Well done");
	                break;
	            default:
	                System.out.println("Invalid grade");
	        }
	    }
	}

