package Extras;



public class Car {
	private String type ;
	private String colour ; 
	private boolean isVisible ; 
	private Car next ; 
	
	public Car(String type , String colour ){
		this.type = type  ;
		this.colour  = colour  ;
		isVisible = true ; 
		setNext(null) ; 
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Car getNext() {
		return next;
	}

	public void setNext(Car next) {
		this.next = next;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
}
	

