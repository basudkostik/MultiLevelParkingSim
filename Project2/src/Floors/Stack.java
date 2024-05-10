package Floors;

import Extras.Car ;
import Extras.Colours ; 


public class Stack {
	private int size ;
	private Car top ; 
	
	public Stack(){
		size = 0 ;  
		top = null ;
		createCarsforStack();	
		
	}

	public Car getTop() {
		Car deleted = null  ; 
		if(!isStackEmpty())
		{
			deleted = new Car ( top.getType() , top.getColour()) ; 
			return deleted ; 
		}	
		else
			return deleted ; 
	}

	public void setTop(Car top) {
		this.top = top;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	private void createCarsforStack() {
		String type = "Stack" ; 
		
		for (int i = 1 ; i < 16 ; i++ ) {
			Car newCar = new Car( type , Colours.assignColour(i));
			insertToStack(newCar);
		}
	}
	
	private void insertToStack(Car newCar) {
		
		newCar.setNext(top) ; 
		top = newCar ; 
		size ++ ; 
	}
	
	public Car removeCarfromStack() throws Exception {
		if(isStackEmpty())
			throw new Exception("The basement is empty");
		
		Car deleted = null ; 
		
		deleted = new Car (top.getType() , top.getColour());
		
		top = top.getNext() ; 
		size--;
		System.out.print(deleted.getType() + "." + deleted.getColour() + " is moved to ground floor from  underground floor\n");
		if(size == 0)
			System.out.print(deleted.getType() + "." +  deleted.getColour() + " is last car of the underground floor\n");
		return deleted;
		
	}
	
	public boolean isStackEmpty() {
		return size == 0 ; 
	}
	

	public void print_Stack() {
		Car temp = top ; 
		while ( temp != null ) {
			System.out.print(  temp.getType()   + "." + temp.getColour() + " ");
			temp = temp.getNext() ; 
		}
	}
	
	
}
