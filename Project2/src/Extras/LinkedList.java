package Extras;

public class LinkedList {
	private Car head_LinkedList ;
	
	public LinkedList (){
		setHead_LinkedList(null) ;
	}

	public Car getHead_LinkedList() {
		return head_LinkedList;
	}

	public void setHead_LinkedList(Car head_LinkedList) {
		this.head_LinkedList = head_LinkedList;
	}
	

	public void push(Car removedCar) {
		if( head_LinkedList  == null ) {
			head_LinkedList = removedCar ; 
			return ; 
		}
		else 
		{
			Car temp = head_LinkedList  ;
			while ( temp.getNext() != null ) {
				temp = temp.getNext() ; 
			}
			temp.setNext(removedCar);
		}
	}
		
	 public void print_LinkedList() {
			Car temp = head_LinkedList;	
			while(temp != null) {
				System.out.print( temp.getType() + "." + temp.getColour()  +   " ");
				temp = temp.getNext() ;
			}
		}
	
}

