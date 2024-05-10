package Extras;

public class Colours {
	
	public static  String assignColour(int integer) {

		String colour =  "" ; 
		
		switch(integer) {
		case 1:
			colour = "Red" ;
			break;
		case 2:
			colour = "Green" ;
			break;
		case 3:
			colour = "Blue" ;
			break;		
		case 4:
			colour = "Indigo" ;
			break;	
		case 5:
			colour = "Orange" ;
			break;		
		case 6:
			colour = "Yellow" ;
			break;		
		case 7:
			colour = "Violet" ;
			break;
		case 8:
			colour = "Grey" ;
			break;
		case 9:
			colour = "Maroon" ;
			break;
		case 10:
			colour = "Black" ;
			break;
		case 11:
			colour = "Olive" ;
			break;
		case 12:
			colour = "Cyan" ;
			break;
		case 13:
			colour = "Pink" ;
			break;
		case 14:
			colour = "Magenta" ;
			break;
		case 15:
			colour = "Tan" ;
			break ; 
			
		default:
			colour = "Water Green" ;	
		}
		
		return colour ; 
	}
}
